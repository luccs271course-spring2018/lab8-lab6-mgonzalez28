1) Why does FixedArrayQueue require an explicit constructor?
   - We need it to initialize the queue to a certain capacity so the program knows how much room we have to work with and to tell the program program that we are starting a queue from scratch so it should be empty. We also need it to tell the program later on where in the queue we want to poll items from, which in this case we want to poll items from index 0 (aka front).
2) What happens when you offer an item to a full FixedArrayQueue?
   - Returns **false**, no more space so item is not added to queue 
3) What happens when you poll an empty FixedArrayQueue?
   - Returns **null**, no more items to remove 
4) What is the time and (extra) space complexity of each of the FixedArrayQueue methods?
   - offer: 
     - Time = O(1)
     - Space = O(1)
   - peek: 
     - Time = O(1)
     - Space = O(1)
   - poll: 
     - Time = O(1)
     - Space = O(1)
   - isEmpty: 
     - Time = O(1)
     - Space = O(1)
   - size:
     - Time = O(1)
     - Space = O(1)
   - asList:
     - Time = O(n)
     - Space = O(n)
