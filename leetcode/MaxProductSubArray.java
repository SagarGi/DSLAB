public class MaxProductSubArray {
    public int maxProduct(int[] nums) {

        if(nums.length == 0)
        {
            return nums[0];
        }
        int currentMaxSoFar = nums[0];
        int currentMinSoFar = nums[0];
        int finalMax = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            int tempMax = currentMaxSoFar;
            currentMaxSoFar = Math.max(Math.max(nums[i], currentMaxSoFar * nums[i]), currentMinSoFar * nums[i]);
            currentMinSoFar = Math.min(Math.min(nums[i], currentMinSoFar * nums[i]), tempMax * nums[i]);
            finalMax = Math.max(finalMax, currentMaxSoFar);

        }
        return finalMax;
    }
}

class MaxProductSubArrayDemo
{
    public static void main(String[] args) {
        MaxProductSubArray mp = new MaxProductSubArray();
        int nums[] = {2,-5,-2,-4,3};
        System.out.println(mp.maxProduct(nums));
    }
}