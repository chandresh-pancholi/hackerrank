import java.util.ArrayList;
import java.util.List;

/**
 * Created by chandresh.pancholi on 17/07/16.
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix =
                {{2, 3}};

        int k = 0, l = 0, m = matrix.length , n = matrix[0].length;
        System.out.println(m + " " + n);
        List<Integer> output = new ArrayList<>();
        int i ;
        while (k < m && l < n) {
            for(i = l; i < n ; i++) {
                output.add(matrix[k][i]);
            }
            k++;

            for(i = k; i < m; i++) {
                output.add(matrix[i][n-1]);
            }
            n--;

            if (k < m) {
                for(i = n - 1; i >= l; i--) {
                    output.add(matrix[m-1][i]);
                }
                m--;
            }

            if( l < n) {
                for(i =  m - 1 ; i >= k; i--) {
                    output.add(matrix[i][l]);
                }
                l++;
            }
        }

        System.out.println(output);


    }
}
