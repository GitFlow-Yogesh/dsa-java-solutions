//majority element appear in array more than n/2 times
//using hashmap=O(N) for both time and space complexity 
public static int findMajorityElement(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int n = arr.length;

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            // Early check: if count > n/2, return immediately
            if (freqMap.get(num) > n / 2) {
                return num;
            }
        }

        // No majority found
        return -1;
    }
//using Moore’s Voting Algorithm (Optimal)=time O(N) but space O(1)
public static int findMajorityMoore(int[] arr) {
    int count = 0, candidate = -1;

    // Phase 1: Find candidate=very easy yogesh just two steps
    for (int num : arr) {
        if (count == 0) {
            candidate = num;
            count = 1;
        } else if (num == candidate) {
            count++;
        } else {
            count--;
        }
    }

    // Phase 2: Verify candidate= after this just confirm whether that is in majority or not thats it .
    count = 0;
    for (int num : arr) {
        if (num == candidate) count++;
    }

    return (count > arr.length / 2) ? candidate : -1;
}
