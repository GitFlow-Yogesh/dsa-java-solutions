//okay steps r simple - just create new array of size n(max_number)+1
                      - put freq of each number into new array and remove the used one in old array 
                      - thn put thm back in same array with frequency array 
When to use = for sort number , not for negetive number , not suitable for large number 
code : 
 import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr) {
        if (arr.length == 0)
            return;
        // Step 1: Find the max value
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        // Step 2: Initialize count array
        int[] count = new int[max + 1];
        // Step 3: Store the count of each element
        for (int num : arr) {
            count[num]++;
        }
        // Step 4: Overwrite the input array with sorted elements
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}



                        
