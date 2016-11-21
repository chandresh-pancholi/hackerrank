import java.util.LinkedList;

/**
 * Created by chandresh.pancholi on 05/06/16.
 */
public class Graph {
    private int v;
    private LinkedList<Integer> adj[];

    public Graph( int v) {
        this.v = v;
        adj = new LinkedList[v];

        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }
}
