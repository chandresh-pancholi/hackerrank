/**
 * Created by chandresh.pancholi on 18/07/16.
 */
public class SpiralmatrixII {
    public static void main(String[] args) {
        int n = 4;
        int m = n;

        int[][] input = new int[n][n];

        int k = 0, l = 0;
        int count = 1;

        while (k < m && l < n) {
            for(int i = l; i < n; i++) {
                input[k][i] = count++;
            }
            k++;

            for(int i = k; i < m; i++) {
                input[i][n-1] = count++;
            }
            n--;

            if(k < m) {
                for(int i = n-1; i >= l; i--) {
                    input[m-1][i] = count++;
                }
                m--;
            }

            if( l < n) {
                for(int i = m-1; i >= k; i--) {
                    input[i][l] = count++;
                }
                l++;
            }
        }

        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input.length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }

    }
}
