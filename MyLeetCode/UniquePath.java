public class UniquePath
{
    public int uniquePaths(int m, int n) {

        int ans = 0;
        // it is done by using dynamic programming
        int dp[][] = new int[m][n];
        // set row to one
        for(int i = 0; i < m; i++)
        {
            dp[i][0] = 1;
        }

        // set down column to zer0
        for(int i = 0; i < n; i++)
        {
            dp[0][i] = 1;
        }

        // trace the other path as
        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        ans = dp[m-1][n-1];
        return ans;
        
    }
}

class UniquePathDemo
{
    public static void main(String[] args) {
        int m = 7;
        int n = 3;
        UniquePath up = new UniquePath();
        System.out.println(up.uniquePaths(m, n));
    }
}