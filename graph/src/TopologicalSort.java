import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by chandresh.pancholi on 05/06/16.
 */
public class TopologicalSort {
    public static void main(String[] args) {
        TopologicalSort g = new TopologicalSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        g.topologicalSort();
    }

    private int v;
    private LinkedList<Integer> adj[];

    public TopologicalSort( int v) {
        this.v = v;
        adj = new LinkedList[v];

        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void topologicalSort()
    {
        Stack stack = new Stack();

        // Mark all the vertices as not visited
        Boolean visited[] = new Boolean[v];
        for (int i = 0; i < v; i++)
            visited[i] = false;

        // Call the recursive helper function to store Topological
        // Sort starting from all vertices one by one
        for (int i = 0; i < v; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);

        // Print contents of stack
        while (stack.empty()==false)
            System.out.print(stack.pop() + " ");
    }

    private void topologicalSortUtil(int v, Boolean[] visited, Stack stack) {
        // Mark the current node as visited.
        visited[v] = true;
        Integer i;

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();
            System.out.println(i);
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }

        // Push current vertex to stack which stores result
        stack.push(new Integer(v));
    }

}
