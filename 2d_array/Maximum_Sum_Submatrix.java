//its good but with care u have to do it 
    public int maxSumSubmatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;
        for (int top = 0; top < rows; top++) {
            int[] temp = new int[cols];
            for (int bottom = top; bottom < rows; bottom++) {
                // Sum columns between top and bottom
                for (int col = 0; col < cols; col++) {
                    temp[col] += matrix[bottom][col];
                }
                // Apply Kadane's algorithm on temp
                int sum = kadane(temp);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // Standard 1D max subarray sum
    public  int kadane(int[] arr) {
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
