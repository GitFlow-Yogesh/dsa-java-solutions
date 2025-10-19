//its same as max sum but few little changes
    public int minSubArrayLen( int k,int[] arr) {
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;
        int right =0;
        while(right<arr.length) {
            sum += arr[right++];
            while (sum >= k) {   // shrink window to make it minimum
                minLen = Math.min(minLen, right - left );
                sum -= arr[left++];
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
