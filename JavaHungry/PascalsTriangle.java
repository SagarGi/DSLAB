public class PascalsTriangle
{
    public static void main(String[] args) {
        // implementing pascals tirangle;
        // using dynamic programming
       
        int n = 5;
        int dp[][] = new int[n + 1][n + 1];
        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j <=i; j++)
            {   
                if(j == 0 || j == n)
                {
                    dp[i][j] = 1;
                }
                else
                {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j <=i; j++)
            {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}