//do it in steps okay - step 1  first find lives 
// step 2  thn set which one has more life like 2 or which one has less like one 
// step 3 - > now change live -> dead and dead -> live depend upon 2 and -1 okay simple very simple
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[] dirs = {-1, 0, 1};
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int live = 0;
                for (int x : dirs) {
                    for (int y : dirs) {
                        if (x == 0 && y == 0) continue;
                        int r = i + x, c = j + y;
                        if (r >= 0 && r < m && c >= 0 && c < n && Math.abs(board[r][c]) == 1) {
                            live++;
                        }
                    }
                }
                if (board[i][j] == 1 && (live < 2 || live > 3)) {
                    board[i][j] = -1; // alive → dead
                }
                if (board[i][j] == 0 && live == 3) {
                    board[i][j] = 2; // dead → alive
                }
            }
        }  
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == -1) board[i][j] = 0;
                if (board[i][j] == 2) board[i][j] = 1;
            }
        }
    }
