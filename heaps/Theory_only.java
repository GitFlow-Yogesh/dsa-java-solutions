//note =use priority que(iska function ye h ki ye sorting order me store krta h by default like min heap so if use reverse thn max heap ho jayega. simple na
Note = its totally different from tree bcz its elements is stored in arrays not in form of trees and nodes so we dont require nodes just values in array which follow some property
like = tree- nodes ,left, right      But heap follows tree property but store in array so only int is require with one array 
Note = it require only 3 things For a node at index i:
      Left=> child: 2*i + 1
      Right=> child: 2*i + 2
      Parent=> (i - 1) // 2
1)What is Heap ===A heap is a special kind of binary tree that satisfies the heap property
2)Types of heap
Max-Heap: The parent node is greater than or equal to its children. == it only store large element at root =(Useful in implementing a priority queue)
Min-Heap: The parent node is less than or equal to its children.  == it only store small element at root =(algorithms like Dijkstra’s shortest path)
3)why = To access min and max at the time  O(1) and to make it more efficient make sure u insert and delete in O(logn) 
4)When to use heap 
  ->You frequently need the min or max element quickly
  ->You’re building a priority queue
  ->You're solving problems that involve sorted order like do sort work first thn next sort work and so on 

  
