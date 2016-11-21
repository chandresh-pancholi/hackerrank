/**
 * Created by chandresh.pancholi on 09/03/16.
 */
public class MinCostPath {
    public static void main(String args[]) {
        int m = 2;
        int n = 2;

        int[][] cost = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 1} };


        int[][] temp = new int[3][3];

        temp[0][0] = cost[0][0];

        for (int i = 1; i <= m ; i++) {
            temp[i][0] = temp[i-1][0] + cost[i][0];
        }

        for(int j = 1; j <= n; j++) {
            temp[0][j] = temp[0][j-1] + cost[0][j];
        }

        int sum = 0;
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                temp[i][j] =  Math.min(temp[i-1][j], Math.min(temp[i-1][j-1], temp[i][j-1])) + cost[i][j];
            }
        }

        System.out.println(temp[m][2]);

    }
}
