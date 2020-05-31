import java.util.Arrays;

public class MaxProductOfArray {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        for(Integer i : nums)
        {
            System.out.print(i);
        }
        int i = nums.length - 1;
        int j = nums.length - 2;
        int result = (nums[i] - 1) * (nums[j] - 1);
        System.out.println(result);

        return result;
    }
}

class MaxProductOfArrayDemo
{
    public static void main(String[] args) {
        int nums[] = {1,5,4,5};
        MaxProductOfArray mpa = new MaxProductOfArray();
        System.out.println(mpa.maxProduct(nums));
    }
}