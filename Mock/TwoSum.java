import java.util.Arrays;

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
}

class TwoSumDemo
{
    public static void main(String[] args) {
        int nums[] = {3,4,2};
        int target = 6;
        TwoSum ts = new TwoSum();
        int result[] = ts.twoSum(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}