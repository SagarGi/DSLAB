import java.util.Scanner;

class MatrixImplementation
{
    int vertices;
    int [][]Matrix;

    public MatrixImplementation(int vertices)
    {
        this.vertices = vertices;
        this.Matrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination)
    {
        Matrix[source][destination] = 1;
        Matrix[destination][source] = 1;
    }

    public void displayMatrix()
    {
        for(int i = 0; i < vertices; i++)
        {
            for(int j = 0; j < vertices; j++)
            {
                System.out.print(Matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class MatrixImplementationDemo
{
    public static void main(String[] args) {
       
        System.out.println("Enter the no of Vetices in graph: ");
        Scanner scanner = new Scanner(System.in);
        int Vertices = scanner.nextInt();
        MatrixImplementation mp = new MatrixImplementation(Vertices);
        System.out.println("Enter the no of edge : ");
        int Edge = scanner.nextInt();

        for(int i = 0; i < Edge; i++)
        {
            System.out.println("Enter Source : ");
            int src = scanner.nextInt();
            System.out.println("Enter Destination :");
            int des = scanner.nextInt();
            mp.addEdge(src, des);

        }

        mp.displayMatrix();
    }
}