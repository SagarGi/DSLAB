import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    int vertices;
    LinkedList<Integer> list[];

    public DFS(int vertices)
    {
        this.vertices = vertices;
        this.list = new LinkedList[vertices];
        for(int i = 0; i < vertices; i++)
        {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination)
    {
        list[source].add(destination);
    }

    public void DepthFirstSearch(int startVertex)
    {
        boolean visited[] = new boolean[vertices];
        dfsrecursion(startVertex, visited);
    }

    public void dfsrecursion(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.print(v + "->");

        // iterate if the graph has other node associated with it

        Iterator<Integer> i = list[v].listIterator();
        while(i.hasNext())
        {
            int value = i.next(); // get the next value in the list at position v
            if(!visited[value])
            {
                dfsrecursion(value, visited);
            }

        }
    }
}

class DFSDemo
{
    public static void main(String[] args) {
        DFS dfs = new DFS(4);
        dfs.addEdge(0,1);
        dfs.addEdge(0,2);
        dfs.addEdge(2,0);
        dfs.addEdge(2,3);
        dfs.addEdge(3,3);

        dfs.DepthFirstSearch(0);
    }
}