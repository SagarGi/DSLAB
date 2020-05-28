import java.util.HashSet;
public class DistributeCandy {
    public int distributeCandies(int[] candies) {
        int count = 0;
        HashSet<Integer> list = new HashSet<>();
        for(Integer i : candies)
        {
            if(!list.contains(i))
            {
                list.add(i);
                count++;
            }

            if(count == candies.length / 2)
            {
                return candies.length / 2;
            }
        }
        return count;
    }
}

class DistributeCandyDemo
{
    public static void main(String[] args) {
        int candies[] = {1,1,1,1,1,2,2,2,3,3};
        DistributeCandy dc = new DistributeCandy();
        System.out.println(dc.distributeCandies(candies));
    }
}