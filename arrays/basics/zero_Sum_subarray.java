//just one min concentration is enough = its amazing
public static boolean hasZeroSumSubarray(int[] arr) {
        Set<Integer> seenSums = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            sum += num;

            if (sum == 0 || seenSums.contains(sum)) {
                return true;  // Found a zero-sum subarray
            }

            seenSums.add(sum);
        }

        return false;
    }
//just in case they want sub array 
public static int[] findZeroSumSubarray(int[] arr) {               //here suppose u get k 
        Map<Integer, Integer> seenSums = new HashMap<>();
        int sumSoFar = 0;

        for (int i = 0; i < arr.length; i++) {
            sumSoFar += arr[i];

            // Case 1: from beginning to i
            if (sumSoFar == 0) {        //instead of zero compare with k 
                return Arrays.copyOfRange(arr, 0, i + 1);
            }

            // Case 2: we saw this sum before
            if (seenSums.containsKey(sumSoFar)) {        //this and below line check for sum-k instead of sum only 
                int start = seenSums.get(sumSoFar) + 1;
                return Arrays.copyOfRange(arr, start, i + 1);
            }

            // store current total with index
            seenSums.put(sumSoFar, i);
        }

        return new int[0]; // no subarray found
    }
