/**
 * Created by chandresh.pancholi on 08/03/16.
 */
public class MaxSizeSubSquareMatrixOnes {
    public static void main(String args[]) {
        int[][] M = {{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};
        int row = M.length;
        int column = M[0].length;

        int [][] S = new int[row][column];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(i == 0 || j == 0){
                    S[i][j] = M[i][j];
                } else {
                    if(M[i][j] == 1) {
                        S[i][j] = Math.min(S[i-1][j], Math.min(S[i][j-1], S[i-1][j-1])) + 1;
                    } else {
                        S[i][j] = 0;
                    }
                }
            }
        }

        int max = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j<column; j++) {
                if(S[i][j] > max) {
                    max = S[i][j];
                }
            }
        }

        for(int i = 0; i<max; i++) {
            for(int j = 0; j<max; j++){
                System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}
