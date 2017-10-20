package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // DONE why do we need an explicit constructor?
  // to know how much room we have in the queue based on the current size
  //and to know where we start and where we end in the queue

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // DONE
    if(size == capacity) {
      System.out.println("Max capacity reached");
      return false;
    }
    size++;
    rear = (rear + 1) % capacity;
    data[rear] = obj;
    return true;
  }

  @Override
  public E peek() {
    // DONE
    if (!isEmpty()) {
      E result = data[front];
      return result;
    }
    return null;
  }

  @Override
  public E poll() {
    // DONE
    if(isEmpty()) {
      return null;
    }
    E result = data[front];
    front = (front + 1) % capacity;
    size--;
    return result;
  }

  @Override
  public boolean isEmpty() {
    // DONE
    if (size == 0) {
      return true;
    }
    return false;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    while(front != null) {
      Queue<E> arrQueue= new ArrayList<E>(capacity);
      list.add(front.data);
      front = front.next;
    }
    return Arrays.asList();
  }
}
