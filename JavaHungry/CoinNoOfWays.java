public class CoinNoOfWays {
    public int noOfWaysCoin(int [] coins , int sum)
    {
        int dp[][] = new int[coins.length + 1][sum + 1];

        int row = dp.length;
        int col = dp[0].length;

        for(int i = 0; i < row; i++)
        {
            dp[i][0] = 1;
        }

        
        for(int i = 1; i < col; i++)
        {
            dp[0][i] = 0;
        }

        for(int i = 1; i < row; i++)
        {
            for(int j = 1; j < col; j ++)
            {
                if(coins[i - 1] > j)
                {
                    dp[i][j] = dp[i - 1][j];
                }
                else
                {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                }
            }
        }

      
        return dp[row - 1][col-1];
    }
}

class CoinNoOfWaysDemo
{
    public static void main(String[] args) {
        CoinNoOfWays cw = new CoinNoOfWays();
        int coins[] = {3};
        int sum = 2;
        System.out.println("No of Ways = " + cw.noOfWaysCoin(coins, sum));
    }
}

// no of ways to distribute coins

