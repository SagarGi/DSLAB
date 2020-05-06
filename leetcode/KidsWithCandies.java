import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<Boolean>();
        //find max by sorting
        for(int i = 0; i < candies.length; i++)
        {
            boolean tempResult = true;
            for(int j = 0; j < candies.length; j++)
            {
                
                if(!(candies[i] + extraCandies >= candies[j]))
                {
                    tempResult = false;
                }

                
            }
            list.add(tempResult);
        }
        return list;
        
    }
}

class KidsWithCandiesDemo
{
    public static void main(String args[])
    {
        int []candies = {12,1,12};
        int extraCandies = 10;
        KidsWithCandies kc = new KidsWithCandies();
        System.out.println(kc.kidsWithCandies(candies, extraCandies));
    }
}