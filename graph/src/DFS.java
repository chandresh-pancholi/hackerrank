import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by chandresh.pancholi on 04/08/16.
 */
public class DFS {
    private static int V;

    private static LinkedList<Integer> adj[];

    public DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    public static void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    public static void removeEdge(int v ) {
        int temp = adj[v].get(0);
        adj[v].remove(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNode = sc.nextInt();
        DFS graph = new DFS(totalNode);

        for (int i = 0; i < totalNode; i++) {
            graph.addEdge(i, sc.nextInt()-1);
        }

        graph.DFS(0);

        int totalQuery = sc.nextInt();

        for (int i = 0; i < totalQuery/2; i++) {
            sc.nextInt();
            int start = sc.nextInt();
            sc.nextInt();
            int edgeRemoved = sc.nextInt();


        }

    }

    public static void DFS(int start) {
        boolean visited[] = new boolean[V];

        for (int i=0; i<V; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
    }
    public static void DFSUtil(int v,boolean visited[]) {
        visited[v] = true;

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n,visited);
            else{
                System.out.println("LOOP");
                break;
            }
        }
    }




}
