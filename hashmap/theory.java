HashMap = A HashMap is a data structure that stores key-value pairs.
When to Use a HashMap=When order doesn't matter,Fast lookups and inserts,when u want to search in O(1) time and insert also using keys
When not to use = Not thread-safe,Does not maintain insertion or sorted order,
What is hashcode = for string or something - it generate a unique number , for Integer the number itself (do chatgpt this line if u didnt get)
example = 
HashMap<String, Integer> map = new HashMap<>();
        // Insert
        map.put("Math", 90);
        map.put("Science", 85);
        // Access
        System.out.println(map.get("Math"));  // 90
        // Check existence
        System.out.println(map.containsKey("Science")); // true
        // Remove
        map.remove("Math");
       // One null key is allowed= but hashtable dont allow this 
        map.put(null, "value1");

        // Multiple null values are allowed
        map.put("key1", null);
        map.put("key2", null);
        // Iterate
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

lets learn something about hashtable =will get more better idea about hashmap
🔹 How HashTables Work Internally
Step-by-Step:
Hashing: A hash function converts the key into an integer (called hash code).
Indexing: That integer is used to compute an index (via modulo operation) into an array of buckets.
Storage: The key-value pair is stored in the bucket at that index.
Collision Handling: If multiple keys map to the same index, handle it using chaining or open addressing.
  Load Factor =Load Factor is the measure of how full a HashMap is allowed to get before it resizes
                 When the HashMap is 75% full, it automatically resizes (usually doubles the number of buckets).
NOte how collision occur - >
  seee under lets convert yogesh to hashcode = 34829449;
              now lets add yadav to hashcode = 584484439;
              both will be stored in a same bucket bczz both module is same 9 ; now it be like a linked list 
now how will i handle collision - Load Factor	size / capacity, used to trigger resizing
Ex- Chaining (Used in Java)
Each bucket is a linked list (or tree).
Multiple entries can exist in a bucket.

Now hashtable can dont allow null pointer but hashmap allow one null pointer (do chatgpt if u dont get)
but hashtable is thread safe but hashmap is not .
  Better option to use ConcurrentHashMap to work with collision when thread safe require , now a days rarely someone use hashtable 


ConcurrentHashMap= ConcurrentHashMap is a thread-safe version of HashMap,It allows safe access by multiple threads without locking the entire map like Hashtable does.
Why Not Just Use Hashtable==Hashtable locks the entire map on every operation — even reads!,This hurts performance in multithreaded applications.


  lets understand nicely 
  hashtable is like there r 10 rows in lib and one person goes inside and not allow others inside until one is done = which makes speed slow
  but ConcurrentHashMap its like if one need row one thn go and access simaltaneously other can access second row a particular code makes it faster 
  but hashmap is like go and access everything i wont care , i wont stop anyone 
