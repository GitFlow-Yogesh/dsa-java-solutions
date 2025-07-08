steps : bro very easy first =Divide array into √N blocks
                             Precompute sum of each block
                             For a query [L, R], break it into:
                             Partial block at the start
                             Full blocks in the middle
                             Partial block at the end
thats it apply it now 

code:
import java.util.*;

public class SqrtDecomposition {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int[] block;
    static int blockSize;

    public static void preprocess() {
        int n = arr.length;
        blockSize = (int)Math.sqrt(n);
        block = new int[blockSize + 1];

        for (int i = 0; i < n; i++) {
            block[i / blockSize] += arr[i];
        }
    }

    public static int query(int l, int r) {
        int sum = 0;

        while (l <= r && l % blockSize != 0) {
            sum += arr[l++];
        }

        while (l + blockSize - 1 <= r) {
            sum += block[l / blockSize];
            l += blockSize;
        }

        while (l <= r) {
            sum += arr[l++];
        }

        return sum;
    }

    public static void main(String[] args) {
        preprocess();
        System.out.println("Sum from 2 to 7 = " + query(2, 7));  // Output: 31
        System.out.println("Sum from 0 to 8 = " + query(0, 8));  // Output: 45
    }
}

