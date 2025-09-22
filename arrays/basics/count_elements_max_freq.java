//leetcode 3005 = its literally nothing just use hashmap 
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Step 1: Count frequency of each element
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        // Step 2: Find the maximum frequency
        int maxFreq = 0;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Step 3: Sum the counts of all elements with max frequency
        int total = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == maxFreq) {
                total += map.get(key);  // add frequency of this element
            }
        }
        return total;
    }
