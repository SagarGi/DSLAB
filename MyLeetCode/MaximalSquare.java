public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int max = Integer.MIN_VALUE;
        // memoixation using dynamic programming
        if(matrix.length == 0)
      {
        return 0;
      }
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m + 1][n + 1];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(matrix[i][j] != '0')
                {
                    
                    int min = Math.min(Math.min(dp[i][j], dp[i][j + 1]), dp[i + 1][j]);
                    dp[i + 1][j + 1] = min + Character.getNumericValue(matrix[i][j]);
                    if(dp[i + 1][j + 1] > max)
                    {
                        max = dp[i + 1][j + 1];
                    }
                }
            }
            
        }

       
        return max * max;
    }
}

class MaximalSquareDemo
{
    public static void main(String[] args) {
        char matrix[][] = { {'1','0','1','0','0'}
                          };
        MaximalSquare ms = new MaximalSquare();
        System.out.println(ms.maximalSquare(matrix));
    }
}
