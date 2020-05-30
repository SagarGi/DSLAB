import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class TopologicalSorting {
    int vertices;
    List<List<Integer>> adj;

    TopologicalSorting(int vertices)
    {
        this.vertices = vertices;
        adj = new ArrayList<>(vertices);
        for(int i = 0; i < vertices; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
    }

    // edges for the graph

    public void addEdge(int source, int destination)
    {
        adj.get(source).add(destination);
    }


    //  we have to do dfs for each vertices for the topological sort

    public void topologicalSorting()
    {
        Stack<Integer> stack = new Stack<>();

        // visited array to keep track of the visited vetices

        boolean visited[] = new boolean[vertices];  //initially all will be false as default value;

        for(int i = 0 ; i < vertices; i++)
        {
            if(!visited[i])
            {
                doDFS(i, visited , stack);
            }
        }

        // print the value in the stack

        while(!stack.isEmpty())
        {
            System.out.println(stack.pop() + " ");
        }
    }

    public void doDFS(int i , boolean visited[], Stack<Integer> stack)
    {
        visited[i] = true; // make it as visited

        Integer j;

        Iterator<Integer> iterator = adj.get(i).iterator(); // if it has adjacent value;
        while(iterator.hasNext())
        {
            j = iterator.next();
            if(!visited[j])
            {
                doDFS(j, visited, stack);
            }
        }

        stack.push(i);

    }
}

class TopologicalSortingDemo
{
    public static void main(String[] args) {
        TopologicalSorting g = new TopologicalSorting(6);
        g.addEdge(5, 2);  
        g.addEdge(5, 0);  
        g.addEdge(4, 0);  
        g.addEdge(4, 1);  
        g.addEdge(2, 3);  
        g.addEdge(3, 1);  

        g.topologicalSorting();
    }
}