public class BuildMaxHeap {

    // Function to build max heap
    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;

        // Start from last non-leaf node and heapify each node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Heapify subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            // Swap and continue heapifying
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 1, 4, 5};
        buildMaxHeap(arr);
      //now u can print after building heap max
    }
}
