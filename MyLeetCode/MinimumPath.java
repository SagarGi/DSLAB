public class MinimumPath {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int dp[][] = new int[row][column];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < column; i++)
        {
            dp[0][i] =  dp[0][i - 1] + grid[0][i];
        }

        for(int i = 1; i < row; i++)
        {
            dp[i][0] =  dp[i - 1][0] + grid[i][0];
        }
        for(int i = 1; i < row; i++)
        {
            for(int j = 1; j < column; j++)
            {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[row - 1][column - 1];
    }
}

class MinimumPathDemo
{
    public static void main(String[] args) {
        MinimumPath mp = new MinimumPath();
        int [][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(mp.minPathSum(grid));
    }
}