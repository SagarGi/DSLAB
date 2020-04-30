public class LargestSubArray {

    public int maxSubArray(int[] nums) {

        int largest = Integer.MIN_VALUE;
        // using brute force
        // for(int i = 0; i < nums.length; i++)
        // {
        //     for(int j = i; j  < nums.length; j++)
        //     {
        //         int sum = 0;
        //         for(int k = 0; k <= j; k++)
        //         {
        //             sum = sum + nums[k];
        //         }
        //         if(sum > largest)
        //         {
        //             largest = sum;
        //         }
        //     }
        // }

        // using dynamic programming

        for(int i = 0; i < nums.length; i++)
        {
            int sum = 0;
            for(int j = i; j < nums.length; j++)
            {
                sum = sum + nums[j];
                if(sum > largest)
                {
                    largest = sum;
                }
            }
        }

        return largest;   
    }

}

class LargestSubArrayDemo
{
    public static void main(String args[])
    {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        LargestSubArray lg = new LargestSubArray();
        System.out.println(lg.maxSubArray(nums));
    }
  
}