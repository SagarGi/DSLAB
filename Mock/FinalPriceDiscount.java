public class FinalPriceDiscount
{
    public int[] finalPrices(int[] prices) {
        if(prices.length == 1)
        {
            return prices;
        }

        for(int i = 0; i < prices.length - 1; i++)
        {
            for(int j = i + 1; j < prices.length; j++)
            {
                if(prices[i] >= prices[j])
                {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}

class FinalPriceDiscountDemo
{
    public static void main(String[] args) {
        int prices[] = new int[]{10,1,1,6};
        FinalPriceDiscount fpd = new FinalPriceDiscount();
        int res[] = fpd.finalPrices(prices);
        
        for(int i = 0; i < res.length; i++)
        {
            System.out.print(res[i] + " ");
        }

    }
}