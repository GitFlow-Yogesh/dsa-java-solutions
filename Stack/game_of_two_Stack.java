public class GameOfTwoStacks {
    public static int maxElements(int[] a, int[] b, int x) {
        int sum = 0;
        int count = 0;
        int i = 0, j = 0;
        // Step 1: Take as many as possible from Stack A
        while (i < a.length && sum + a[i] <= x) {
            sum += a[i];
            i++;
        }
        count = i;
        // Step 2: Try adding from B, remove from A if needed
        while (j < b.length && i >= 0) {
            sum += b[j];
            j++;
            // Remove items from A if sum exceeds x
            while (sum > x && i > 0) {
                i--;
                sum -= a[i];
            }
            // Update max count if within limit
            if (sum <= x) {
                count = Math.max(count, i + j);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Example 1
        int[] a1 = {4, 2, 4, 6, 1};
        int[] b1 = {2, 1, 8, 5};
        int x1 = 10;
        System.out.println("Max elements removed: " + maxElements(a1, b1, x1));  // Output: 4
    }
}
