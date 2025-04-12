
class Main {
    private static boolean isSafe(boolean[][] board,int row,int col){
        //vertical check
        for(int i=0;i<row;i++){
            if(board[i][col])return false;
        }
        //leftside
        int maxleft= Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i])return false;
        }
        //rightside
        int rightmax=Math.min(row,board.length-col-1);
        for(int i=1;i<=rightmax;i++){
            if(board[row-i][col+i])return false;
        }
        return true;
    }
    private static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean x : row){
                if(x){System.out.print("Q ");}
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    private static int queen(boolean[][] board,int row){
        //base condition
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        //count 
        int count =0;
        for(int col=0;col<board.length;col++){
            //can we place on it 
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count += queen(board,row+1);
                board[row][col]=false;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        boolean[][] board = new boolean[4][4];
        System.out.println(queen(board,0));
    }
}
