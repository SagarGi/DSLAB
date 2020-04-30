public class LargestSubArray {

    public int maxSubArray(int[] nums) {

        int largest = 0;
        // using brute force
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i; j  < nums.length; j++)
            {
                int sum = 0;
                for(int k = 0; k <= j; k++)
                {
                    sum = sum + nums[k];
                }
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
        int nums[] = {1,2,3,4,-1,-1};
        LargestSubArray lg = new LargestSubArray();
        System.out.println(lg.maxSubArray(nums));
    }
  
}