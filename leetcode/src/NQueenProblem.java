/**
 * Created by chandresh.pancholi on 27/07/16.
 */
public class NQueenProblem {
    static int count = 0;
    public static void main(String[] args) {
        final int n = 4;

        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = 0;
            }
        }
        NQueenProblem nq = new NQueenProblem();
        nq.NQUtil(board, 0);
        System.out.println(count);
    }

    public boolean NQUtil(int[][] board, int col) {
        if (col == board.length) {
            count = count + 1;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 1) {
                        System.out.print("Q ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }
            return true;

        }
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board,i, col)) {
                board[i][col] = 1;

                if (NQUtil(board, col+1) == true) {
                    return true;
                }
                board[i][col] = 0;

            }
        }
        return false;

    }

    private boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; j >= 0 && i < board.length; i++,j--){
            if (board[i][j] == 1){
                return false;
            }
        }
        return true;
    }

}
