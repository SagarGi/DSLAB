public class SquareSubMatrix
{
    public int countSquares(int[][] matrix) {
        
        // solving using dynamic programming
        // create a new matrix dp
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        int dp[][] = new int[m + 1][n + 1];
        for(int i = 0; i < m ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                // find out the min
                if(matrix[i][j] != 0)
                {
                    int min = Math.min(Math.min(dp[i][j], dp[i][j + 1]), dp[i + 1][j]);
                    dp[i + 1][j + 1] = min + matrix[i][j];
                    count = count + dp[i + 1][j + 1];
                }
                
            }
        }
        return count;
    }
}

class SquareSubMatrixDemo
{
    public static void main(String[] args) {
        int [][] matrix = {{1,0,1},{1,1,0},{1,1,0}};
        SquareSubMatrix ssm = new SquareSubMatrix();
        System.out.println(ssm.countSquares(matrix));
    }
}