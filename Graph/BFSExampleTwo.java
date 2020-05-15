import java.util.Iterator;
import java.util.LinkedList;

public class BFSExampleTwo {
    int vertices;
    LinkedList<Integer> list[];

    public BFSExampleTwo(int vertices)
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
        list[source].add(destination);
    }

    public void BFS(int startVertex)
    {
        boolean visited[] = new boolean[vertices];
        BreadthFirstSearch(startVertex, visited);

    }

    public void BreadthFirstSearch(int startVertex, boolean visited[])
    {
        visited[startVertex] = true;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(startVertex);

        while(q.size() != 0)
        {
            startVertex = q.poll();
            switch(startVertex)
            {
                case 0 : System.out.print("1 -> ");
                break;
                case 1 : System.out.print("2 -> ");
                break;
                case 2 : System.out.print("3 -> ");
                break;
                case 3 : System.out.print("4 -> ");
                break;
                case 4 : System.out.print("5 -> ");
                break;
                case 5 : System.out.print("6 -> ");
                break;
               default : break;
            }


            Iterator<Integer> i = list[startVertex].listIterator();
            while(i.hasNext())
            {
                int value = i.next();
                if(!visited[value])
                {
                    visited[value] = true;
                    q.add(value);
                }
            }

        }
    }
}

class BFSExampleTwoDemo
{
    public static void main(String[] args) {

        BFSExampleTwo b2 = new BFSExampleTwo(6);
        b2.addEdge(0,1);
        b2.addEdge(0,2);
        b2.addEdge(1,4);
        b2.addEdge(1,3);
        b2.addEdge(2,4);
        b2.addEdge(3,5);
        b2.addEdge(3,4);

        b2.BFS(0);
        
    }
}