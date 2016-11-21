/**
 * Created by chandresh.pancholi on 20/07/16.
 */
public class MinPathSum {
    public static void main(String[] args) {
        int[][] input = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 1} };
        int m = input.length;
        int n = input[0].length;

        int[][] dp = new int[m][n];

        dp[0][0] = input[0][0];
        for(int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] + input[i][0];
        }

        for(int i = 1; i < n; i++ ) {
            dp[0][i] = dp[0][i-1] + input[0][i];
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + input[i][j];
            }
        }

        System.out.println(dp[m-1][n-1]);
    }

}
