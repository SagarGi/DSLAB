public class CoinChange1 {

    // solving by greedy method wich is not optimized to find the minimum coins
    public int coinChangeGreedyAlgorithm(int[] coins, int amount) {
        int count = 0;
        
        while(amount != 0)
        {
            int max = 0;
            for(int i = 0; i < coins.length; i++)
            {
                if(coins[i] <= amount)
                {
                    max = coins[i];
                }
            }
            if(max == 0)
            {
                return -1;
            }
            amount = amount - max;
            count++;
        }
        if(count > 0)
        {
            return count;
        }

     return -1;
        
    }


    public int coinChangeDynamicProgramming(int[] coins, int amount) {
       
        int dp[][] = new int[coins.length + 1][amount + 1];
        int row = dp.length;
        int col = dp[0].length;

        for(int i = 0; i < row; i++)
        {
            dp[i][0] = 0;
        }

        for(int i = 0; i < col; i++)
        {
            dp[0][i] = i;
        }


        for(int i = 1; i < row; i++)
        {
            for(int j =  1; j < col; j ++)
            {
                if(coins[i - 1] > j)
                {
                    dp[i][j] = dp[i - 1][j];
                }
                else
                {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                }
            }
        }

            
        return dp[row - 1][col - 1]; // this gives only correct answer when the amount sum exists. 
    }
    
}

class CoinChange1Demo
{
    public static void main(String[] args) {
        CoinChange1 c1 = new CoinChange1();
        int coins[] = {2};
        int amount = 10;
        System.out.println(c1.coinChangeDynamicProgramming(coins, amount));

    }
}