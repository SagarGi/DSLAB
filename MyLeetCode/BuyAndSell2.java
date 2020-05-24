public class BuyAndSell2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1; i++)
        {
            if(prices[i + 1] > prices[i])
            {
                maxProfit = maxProfit + (prices[i + 1] - prices[i]);
            }
        }

        return maxProfit;
    }
}

class BuyAndSell2Demo
{
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        BuyAndSell2 bs = new BuyAndSell2();
        System.out.println(bs.maxProfit(prices));
    }
}