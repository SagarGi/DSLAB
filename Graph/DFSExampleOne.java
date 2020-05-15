import java.util.Iterator;
import java.util.LinkedList;

public class DFSExampleOne {
    int vertices;
    LinkedList<Integer> list[];

    public DFSExampleOne(int vertices)
    {
        this.vertices = vertices;
        this.list = new  LinkedList[vertices];
        for(int i = 0; i < vertices; i++)
        {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination)
    {
        list[source].add(destination);
    }

    public void DepthFirstSearch(int start)
    {
        boolean visited[] = new boolean[vertices];
        dfsRecursion(start, visited);
    }

    public void dfsRecursion(int v, boolean visited[])
    {
        visited[v] = true;
        
        switch(v)
        {
            case 0 : System.out.print('A' + "--> ");
            break;
            case 1 : System.out.print('B' + "--> ");
            break;
            case 2 : System.out.print('C' + "--> ");
            break;
            case 3 : System.out.print('D' + "-->  ");
            break;
            case 4 : System.out.print('E' + "--> ");
            break;
            case 5 : System.out.print('F' + "--> ");
            break;
            default: break;
        }

        Iterator<Integer> i = list[v].listIterator();
        while(i.hasNext())
        {
            int value = i.next();
            if(!visited[value])
            {
                dfsRecursion(value, visited);
            }
        }
    }
}

class DFSExampleOneDemo
{
    public static void main(String[] args) {
        DFSExampleOne dsf = new DFSExampleOne(6);
        dsf.addEdge(0,4);
        dsf.addEdge(0,2);
        dsf.addEdge(2,1);
        dsf.addEdge(1,5);
        dsf.addEdge(5,3);
        dsf.addEdge(5,4);
        dsf.addEdge(3,2);

        dsf.DepthFirstSearch(0);
    }
}