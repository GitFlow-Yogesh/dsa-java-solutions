//used to find max subarr= very very simple just one min 
public static int kadane(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
