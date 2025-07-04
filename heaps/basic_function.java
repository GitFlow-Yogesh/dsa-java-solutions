import java.util.*;

public class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    // Get parent and child indexes
    private int parent(int i) { return (i - 1) / 2; }
    private int left(int i) { return 2 * i + 1; }
    private int right(int i) { return 2 * i + 2; }

    // Swap helper
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Insert a new element
    public void insert(int val) {
        heap.add(val); // add at end
        int i = heap.size() - 1;

        // Bubble up
        while (i > 0 && heap.get(i) < heap.get(parent(i))) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Get min element
    public int peek() {
        if (heap.isEmpty()) throw new NoSuchElementException();
        return heap.get(0);
    }

    // Remove min (root) and heapify down
    public int removeMin() {
        if (heap.isEmpty()) throw new NoSuchElementException();

        int min = heap.get(0);  //remember we cant remove.get()=bcz it will remove from 0 and thn shift automatic but we dont want that 
        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }

        return min;
    }

    private void heapifyDown(int i) {
        int smallest = i;
        int left = left(i);
        int right = right(i);

        if (left < heap.size() && heap.get(left) < heap.get(smallest))
            smallest = left;
        if (right < heap.size() && heap.get(right) < heap.get(smallest))
            smallest = right;

        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }

    // Print heap
    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap();

        h.insert(10);
        h.insert(5);
        h.insert(20);
        h.insert(2);
        h.insert(8);

        h.printHeap();        // [2, 5, 20, 10, 8]
        System.out.println(h.peek()); // 2

        h.removeMin();        // removes 2
        h.printHeap();        // [5, 8, 20, 10]
    }
}
