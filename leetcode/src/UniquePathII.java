/**
 * Created by chandresh.pancholi on 20/07/16.
 */
public class UniquePathII {
    public static void main(String[] args) {
        int[][] input = {{0, 0, 0},
            {0, 1, 0},
            {0, 0, 0} };

        int m = input.length;
        int n = input[0].length;

        if(input[0][0] == 1 || input[m-1][n-1] == 1) {
            return;
        }

        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        for(int i = 1; i < m; i++) {
            if(input[i][0] == 0) {
                dp[i][0] = dp[i-1][0];
            }
            else {
                dp[i][0] = 0;
            }
        }

        for(int i = 1; i < n; i++) {
            if(input[0][i] == 0) {
                dp[0][i] = dp[0][i-1];
            }
            else {
                dp[0][i] = 0;
            }
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(input[i][j] == 1){
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        System.out.println(dp[m-1][n-1]);
    }

}
