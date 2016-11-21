package v0;

/**
 * Created by chandresh.pancholi on 28/07/16.
 */
public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        solve(maze);
    }

    private static void solve(int[][] maze) {
        int sol[][] = { {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };

        if (isSolveUtil(maze, 0, 0, sol)) {
            for (int i = 0; i < sol.length; i++) {
                for (int j = 0; j < sol[0].length; j++) {
                    System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Solution doesn't exit");
        }
    }

    private static boolean isSolveUtil(int[][] maze, int x, int y, int[][] sol) {
        if (x == maze.length -1 && y == maze.length - 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(x, y, maze)) {
            sol[x][y] = 1;
            if (isSolveUtil(maze, x+1, y, sol) == true) {
                return true;
            }
            if (isSolveUtil(maze, x, y+1, sol) == true) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    private static boolean isSafe(int x, int y, int[][] maze) {
        return x >= 0 && x <= maze.length - 1 && y >= 0 && y <= maze[0].length  && maze[x][y] == 1;
    }

}
