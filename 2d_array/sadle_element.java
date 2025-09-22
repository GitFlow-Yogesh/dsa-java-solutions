//its very easy just one min concentration 
    public static void findSaddlePoint(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            int rowMin = matrix[i][0];
            int colIndex = 0;

            // Find minimum in the row
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check if rowMin is the maximum in its column
            boolean isSaddle = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle point is: " + rowMin + " at (" + i + ", " + colIndex + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No saddle point found.");
        }
    }
