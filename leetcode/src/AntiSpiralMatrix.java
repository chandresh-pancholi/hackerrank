import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by chandresh.pancholi on 19/07/16.
 */
public class AntiSpiralMatrix {
    public static void main (String[] args) {
        int[][] matrix =
                {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        int k = 0, l = 0, m = matrix.length , n = matrix[0].length;
        System.out.println(m + " " + n);
        Stack<Integer> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();
        int i ;
        while (k < m && l < n) {
            for(i = l; i < n ; i++) {
                stack.push(matrix[k][i]);

                output.add(matrix[k][i]);
            }
            k++;

            for(i = k; i < m; i++) {
                stack.push(matrix[i][n-1]);

                output.add(matrix[i][n-1]);
            }
            n--;

            if (k < m) {
                for(i = n - 1; i >= l; i--) {
                    stack.push(matrix[m-1][i]);

                    output.add(matrix[m-1][i]);
                }
                m--;
            }

            if( l < n) {
                for(i =  m - 1 ; i >= k; i--) {
                    stack.push(matrix[i][l]);

                    output.add(matrix[i][l]);
                }
                l++;
            }

        }

        System.out.println(output);
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }

}
