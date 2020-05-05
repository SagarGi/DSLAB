public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {

        int result = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                if(grid[i][j] == 1)
                {
                    result = result + 4;

                    if(i > 0 && grid[i-1][j] == 1) // checks the upper one
                    {
                        result = result - 2;
                    }

                    if(j > 0 &&  grid[i][j-1] == 1) // checks the side one
                    {
                        result = result -2;
                    }
                }
            }
        }
        return result;
        
    }
    
}

class IslandPerimeterDemo
{
    public static void main(String args[])
    {
        int grid[][] = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        IslandPerimeter ip = new IslandPerimeter();
        System.out.println(ip.islandPerimeter(grid));
    }
}