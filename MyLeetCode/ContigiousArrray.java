import java.util.HashMap;

public class ContigiousArrray {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        // replace all the zero with -1
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                nums[i] = -1;
            }
        }

        int current = 0;
        int maxLength = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); // it is the initial value of the map
        int cumulativeSum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            cumulativeSum = cumulativeSum + nums[i];
            if(!map.containsKey(cumulativeSum))
            {
                map.put(cumulativeSum, i);
            }

            if(map.containsKey(cumulativeSum))
            {
                current = i - map.get(cumulativeSum);
            }

            maxLength = Math.max(current, maxLength);
        }

        return maxLength;
    }
}

class ContigiousArrrayDemo
{
    public static void main(String[] args) {
        int nums[] = {0,1,0};
        ContigiousArrray ca = new ContigiousArrray();
        System.out.println(ca.findMaxLength(nums));
    }
}