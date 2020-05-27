import java.util.HashMap;

public class MaxSubArrayK {
    public int longestSubArrayK(int nums[], int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int cumulativeSum = 0;
        int currentlength = 0;
        int maxlength = 0;
        for(int i = 0; i < nums.length; i++)
        {
            cumulativeSum += nums[i];
            if(!map.containsKey(cumulativeSum))
            {
                map.put(cumulativeSum, i);
            }

            if(map.containsKey(cumulativeSum - k))
            {
                currentlength = i - map.get(cumulativeSum - k);
            }

            maxlength = Math.max(currentlength, maxlength);
        }

        return maxlength;
    }
}


class MaxSubArrayKDemo
{
    public static void main(String[] args) {
        int nums[] = {10,5,7,1,2,5,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int k = 15;
        MaxSubArrayK msk = new MaxSubArrayK();
        System.out.println(msk.longestSubArrayK(nums, k));
    }
}