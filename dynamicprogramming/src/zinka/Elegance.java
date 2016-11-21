package zinka;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by chandresh.pancholi on 18/05/16.
 */
public class Elegance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] path = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                path[i][j] = sc.nextInt();
            }
        }

        int temp[][] = new int[m][n];

        temp[0][0] = path[0][0];

        for (int i = 1; i < n; i++) {
            temp[0][i] = temp[0][i - 1] + path[0][i];
        }
        for (int j = 1; j < m; j++) {
            temp[j][0] = temp[j - 1][0] + path[j][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                temp[i][j] = Math.min( temp[i - 1][j], temp[i][j - 1]) + path[i][j];
            }
        }
        System.out.println(temp[m][n]);
    }


}
