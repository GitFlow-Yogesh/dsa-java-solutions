//ntg can be easier than this ntg 
public int diagonalSum(int[][] mat) {
        int primarysum =0;
        int secondarysum=0;
        for(int i =0;i<mat.length;i++){
            primarysum += mat[i][i];
            secondarysum += mat[i][mat.length-i-1];
        }
        int total = primarysum+secondarysum;
        if(mat.length%2 != 0){
            total -= mat[mat.length/2][mat.length/2];
        }
        return total;
    }
