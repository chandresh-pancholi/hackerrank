package v0;

/**
 * Created by chandresh.pancholi on 28/07/16.
 */
public class GraphColoring {
    public static void main(String[] args) {
        int[][] graph = {{0, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 1},
                {1, 0, 1, 0}};
        int m = 3;

        graphColoring(graph, m);
    }

    private static void graphColoring(int[][] graph, int m) {
        int[] color = new int[graph.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = 0;
        }

        if (graphColoringUtil(graph, color, m, 0)) {
            for (int i = 0; i < color.length; i++) {
                System.out.print(color[i]+ " ");
            }
        } else {
            System.out.println("Solution doesn't exist");
        }
    }

    private static boolean graphColoringUtil(int[][] graph, int[] color, int m, int v) {
        if (v == graph.length) {
            return true;
        }
        for (int c = 1; c <= m; c++) {
            if (isSafe(v,graph, c, color )) {
                color[v] = c;
                if (graphColoringUtil(graph, color, m, v+1)) {
                    return true;
                }
            }
            color[v] = 0;
        }
        return false;
    }

    private static boolean isSafe(int v, int[][] graph, int c, int[] color) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[v][i] !=0  && color[i] == c ){
                return false;
            }
        }
        return true;
    }
}
