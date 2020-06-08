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
    
}

class CoinChange1Demo
{
    public static void main(String[] args) {
        CoinChange1 c1 = new CoinChange1();
        int coins[] = {1,2,5};
        int amount = 11;
        System.out.println(c1.coinChangeGreedyAlgorithm(coins, amount));

    }
}