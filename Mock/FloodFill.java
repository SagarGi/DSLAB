public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // it can be done using dfs i.e recursion
        if(newColor == image[sr][sc])
        {
            return image;
        }
        DFSFill(image, sr,sc,newColor, image[sr][sc]);
        return image;
    }

    public void DFSFill(int[][] image, int row, int col, int newColor, int oldColor)
    {
        // check the boundry if it crosses the image or not

        if(row >= image.length || row < 0 || col >= image[0].length || col < 0 || image[row][col] != oldColor)
        {
            return;
        }

        image[row][col] = newColor;

        DFSFill(image, row - 1, col, newColor, oldColor);
        DFSFill(image, row + 1, col, newColor, oldColor);
        DFSFill(image, row, col - 1, newColor, oldColor);
        DFSFill(image, row, col + 1, newColor, oldColor);
        
    }
}

class FloodFillDemo
{
    public static void main(String[] args) {
        int image[][] = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        FloodFill ff = new FloodFill();
        int result[][] = ff.floodFill(image, sr, sc, newColor);

        for(int i = 0; i < image.length; i++)
        {
            for(int j = 0; j < image[0].length; j++)
            {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}