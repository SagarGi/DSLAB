public class DijsktrasAlgorithm {
    int vertices;
    int graph[][];

    //initialize graph and vertices

    DijsktrasAlgorithm(int vertices)
    {
        this.vertices = vertices;
        graph = new int[][]{{0,2,0,4,0,0},{0,0,1,7,0,0},{0,0,0,0,3,0},{0,0,0,0,0,2},{0,0,0,2,0,5},{0,0,0,0,0,0}};
    }

    public int findMinVertex(int distance[], boolean visited[])
    {
        int minVertex = -1; // which is assumpion
        int minimun = Integer.MAX_VALUE;

        for(int i = 0; i < vertices; i++)
        {
            if(!visited[i] && distance[i] <= minimun)
            {
                minimun = distance[i];
                minVertex = i;
            }
        }

        return minVertex;
    }

    public void dijsktrasAlgorithm(int source)
    {
        boolean visited[] = new boolean[vertices];
        int distance[] = new int[vertices];

        for(int i = 0; i < vertices; i++)
        {
            distance[i] = Integer.MAX_VALUE; // or you can assume it as infinity
        }

        // take inititial source as distance zero

        distance[source] = 0;

        for(int i = 0; i < vertices; i++)
        {
            // now we call a function which finds the minimum distance
            int u = findMinVertex(distance, visited);

            visited[u] = true;

            for(int v = 0; v < vertices; v++)
            {
                if(graph[u][v] != 0 && !visited[v] && distance[u] != Integer.MAX_VALUE)
                {
                    int value = distance[u] + graph[u][v];
                    if(value < distance[v])
                    {
                        distance[v] = value;
                    }
                }
            }
        }

        // display the minimum distance from all vertex;
        for(int i = 0; i < vertices; i++)
        {
            System.out.println(distance[i]);
        }

    }


    
}
class DijsktrasAlgorithmDemo
{
    public static void main(String[] args) {
        // initialize the graph which is in matrix implementation

        DijsktrasAlgorithm d = new DijsktrasAlgorithm(9);
        d.dijsktrasAlgorithm(0);
    }
}

