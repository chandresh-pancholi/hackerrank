package v0;

import java.util.Objects;

/**
 * Created by chandresh.pancholi on 27/07/16.
 */
public class KnightTour  {
    public static void main(String[] args) {
        solveKT();
    }

    private static void solveKT() {
        int sol[][] = new int[8][8];
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                sol[i][j] = -1;
            }
        }

        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        sol[0][0] = 0;

        if (solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            for(int i = 0; i < sol.length; i++) {
                for (int j = 0; j < sol.length; j++) {
                    System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Solution doesn't exit");
        }

    }

    private static boolean solveKTUtil(int x, int y, int movei, int[][] sol, int[] xMove, int[] yMove) {
        if (movei == sol.length * sol.length) {
            return true;
        }
        int k, next_x,next_y;

        for (k = 0; k < sol.length; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];

            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1,
                        sol, xMove, yMove))
                    return true;
                else
                    sol[next_x][next_y] = -1;

            }
        }
        return false;
    }

    private static boolean isSafe(int next_x, int next_y, int[][] sol) {
        return (next_x >= 0 && next_x < 8 && next_y >= 0 && next_y < 8 && sol[next_x][next_y] == -1);
    }
}
