/**
 * Created by chandresh.pancholi on 20/07/16.
 */
public class UniquePath {
    public static void main(String[] args) {
        int[][] temp = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };
//        System.out.println(dfs(0,0, temp.length, temp[0].length));
        int m = temp.length;
        int n = temp[0].length;

        int[][] dp = new int[m][n];

        for(int i = 0 ; i < n; i++ ){
            dp[0][i] = 1;
        }

        for(int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        System.out.println(dp[m-1][n-1]);

    }

    private static int dfs(int i, int j, int m, int n) {
        if (i == m-1 && j == n-1) {
            return  1;
        }
        if( i < m-1 && j < n-1 ) {
            return dfs(i+1, j, m, n) + dfs(i, j + 1, m, n);
        }
        if(i < m-1) {
            return dfs(i+1, j, m, n);
        }

        if(j < n-1) {
            return dfs(i, j+1, m, n  );
        }

        return 0;

    }
}
