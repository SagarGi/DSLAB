class BestTimeBuyAndSell
{
    public int maxProfit(int[] prices) {

        if(prices.length == 0)
        {
            return 0;
        }
        int maxProfit = 0;
        int min = prices[0];
        for(int i = 0; i < prices.length; i++)
        {
           int currMin = prices[i];
           if(currMin < min)
           {
               min = currMin;
           }
            int tempProfit = prices[i] - min;
            if(tempProfit > maxProfit)
            {
                maxProfit = tempProfit;
            }
        }
        return maxProfit;
    }
}

class BestTimeBuyAndSellDemo
{
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        BestTimeBuyAndSell bs = new BestTimeBuyAndSell();
        System.out.println(bs.maxProfit(prices));
    }
}