// very easy if u want to return new 
public int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
}
//just print 
for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
}
