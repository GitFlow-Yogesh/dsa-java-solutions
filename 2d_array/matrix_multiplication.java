// ntg can be easier than this 
        int m = A.length;        // rows of A
        int n = A[0].length;     // columns of A
        int p = B[0].length;     // columns of B

        int[][] C = new int[m][p];

        // Multiply matrices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
