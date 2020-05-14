import java.util.LinkedList;
import java.util.Scanner;

public class AdjacencyListGraph {
    // instance variable for the graph
    int vertices;
    LinkedList<Integer> list[];

    // methods
    public AdjacencyListGraph(int vertices)
    {
        this.vertices = vertices;
        this.list = new LinkedList[vertices];

        for(int i = 0; i < vertices; i++)
        {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source , int destination)
    {
        list[source].add(destination);
        list[destination].add(source);
    }

    public void displayGraph()
    {
        for(int i = 0; i < vertices; i++)
        {
            if(list[i].size() > 0)
            {
                System.out.println("Here the vertex " + i + " is Connected to");
                for(int j = 0; j < list[i].size(); j++)
                {
                    System.out.print(list[i].get(j) + "\t");
                }

            }
            System.out.println();
        }
    }
}

class AdjacencyListGraphDemo
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        AdjacencyListGraph ag = new AdjacencyListGraph(V);
        ag.addEdge(0 , 1);
        ag.addEdge(1 , 2);
        ag.addEdge(2 , 0);

        System.out.println("Your Adjacency List is : ");
        ag.displayGraph();


    }
}

// a practise from youtube