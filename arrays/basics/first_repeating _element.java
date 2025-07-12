//use loops simple and clear = but O(N^2) time com but no extra space 
public static int firstRepeatingElement(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                return arr[i];
            }
        }
    }
    return -1;
}
//u can use hashset also
public static int firstRepeatingElement(int[] arr) {
    Set<Integer> seen = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
        if (seen.contains(arr[i])) {
            return arr[i];  // First repeating element
        }
        seen.add(arr[i]);
    }

    return -1;  // No repeating element
}
//we can use hashmap also to count the freq and return first whose freq is more than one
public static int firstRepeatingElement(int[] arr) {
        Map<Integer, Integer> freq = new LinkedHashMap<>(); // Keeps insertion order
        // Count frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // Find the first element with frequency > 1
        for (Integer key : freq.keySet()) {
            if (freq.get(key) > 1) {
                return key; // First repeating element
            }
        }
        return -1; // No repeating element
    }
//amazing question it was 
//now what if they ask first non repeating element = thn just change this 
        (freq.get(key) > 1) => (freq.get(key) == 1)
