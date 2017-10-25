1) Why does FixedArrayQueue require an explicit constructor?
   - We need to initialize the queue to a certain capacity so we know how much room we have to work with
2) What happens when you offer an item to a full FixedArrayQueue?
   - Returns **false**, item is not added to queue 
3) What happens when you poll an empty FixedArrayQueue?
   - Returns **null**, no more items 
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
