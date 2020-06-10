import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = i + 1; j < nums.length; i++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }

        return result;
    }
    public int[] twoSumHashMap(int nums[], int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                return new int[]{(map.get(target -nums[i])) , i};
            }
            map.put(nums[i], i);
        }

        return new int[2];
    }
}

class TwoSumDemo
{
    public static void main(String[] args) {
        int nums[] = {3,4,2};
        int target = 6;
        TwoSum ts = new TwoSum();
        int result[] = ts.twoSumHashMap(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}