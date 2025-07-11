//By one = cyclic rotate
public static void rotateByOne(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        int last = arr[n - 1];  // store last element

        // Shift elements right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last; // place last element at first
    }
//By k element === its easy but not efficient why = time com is O(n*k) times which is not good we can do better but atleast we found easy solution using brute force 
while (k > 0) {
    int last = arr[n - 1];  // Step 1: store last element

    // Step 2: shift all elements to the right
    for (int i = n - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
    }

    // Step 3: move last element to front
    arr[0] = last;

    k--;
}
//more efficient way is using reverse algo bcz time is O(N) and space is O(1)== bro its very easy logic 
//steps = first whole array , thn reverse first k , thn reverse remaing part 
public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k % n == 0) return;

        k = k % n;  // Handle if k > n

        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
    }

    // Helper method to reverse a part of array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

//that's it buddy 


//what if i want u to reverse by left .
//same as above just reverse = first reverse first k element and thn reverse remaining elements and reverse the whole array = thats it other thing r same 
// Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse the whole array
        reverse(arr, 0, n - 1);
