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
