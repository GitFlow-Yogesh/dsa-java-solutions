//seaching  linear u can do anytime now when array is sorted left->right and top->bottom then apply stair case search 
//note - ntg can be easier than this in 2d array 
public static void staircaseSearch(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1; // start from top-right

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                System.out.println("Found at (" + row + ", " + col + ")");
                return;
            } else if (arr[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }

        System.out.println("Not Found");
}
