import java.util.Iterator;
import java.util.LinkedList;

public class BFSExampleOne {
    int vertices;
    LinkedList<Integer> list[];

    public BFSExampleOne(int vertices)
    {
        this.vertices = vertices;
        list = new LinkedList[vertices];

        for(int i = 0; i < vertices; i++)
        {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination)
    {
        // for directed graph
        list[source].add(destination);
    }

    public void BreadthFirstSearch(int startVertex)
    {
        boolean visited[] = new boolean[vertices];
        BFS(startVertex, visited);

    }

    // in dfs we use stack whose work is dine by the recursion but in bfs we use queuq;
    public void BFS(int startVertex, boolean visited[])
    {
        visited[startVertex] = true;
        //  create linked list as queue
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(startVertex);

        while(queue.size() != 0)
        {
            startVertex = queue.poll();
            System.out.print(startVertex + "--> ");

            Iterator<Integer> i = list[startVertex].listIterator();
            while(i.hasNext())
            {
                int value = i.next();
                if(!visited[value])
                {
                    visited[value] = true;
                    queue.add(value);
                }
            }

        }
    }   
}

class BFSExampleOneDemo
{
    public static void main(String[] args) {
        BFSExampleOne bfs = new BFSExampleOne(4);
        bfs.addEdge(0,1);
        bfs.addEdge(1,2);
        bfs.addEdge(2,0);
        bfs.addEdge(2,3);
        bfs.addEdge(1,2);
        bfs.addEdge(3,3);

        bfs.BreadthFirstSearch(0);
    }
}