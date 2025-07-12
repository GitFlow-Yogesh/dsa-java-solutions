//using sliding window but works with only positive integers 
public static int longestSubarrayPositiveOnly(int[] arr, int K) {
    int left = 0, right = 0, sum = 0, maxLen = 0;
    while (right < arr.length) {
        sum += arr[right];
        while (sum > K && left <= right) {
            sum -= arr[left++];
        }
        if (sum == K) {
            maxLen = Math.max(maxLen, right - left + 1);
        }
        right++;
    }
    return maxLen;
}
//what if they ask for array instead of length thn ntg just track right and left== kuch nhi h bhai right ko end and left ko start kr de  
first change 
  int start = -1, end = -1; //this should be declared to track
second change 
  if (sum == K) {
            int len = right - left + 1;
            if (len > maxLen) {
                maxLen = len;
                start = left;
                end = right;
            }
        }

//baki sab same h but only works for positive numbers = brute force with early break;
public static void findFirstSubarraySumK(int[] arr, int K) {
    for (int i = 0; i < arr.length; i++) {
        int sum = 0;
        for (int j = i; j < arr.length; j++) {
            sum += arr[j];
            if (sum == K) {
                System.out.print("First subarray with sum " + K + ": ");
                for (int x = i; x <= j; x++) {
                    System.out.print(arr[x] + " ");
                }
                return;
            }
        }
    }

    System.out.println("No subarray found with sum = " + K);
}
