public class HouseRobber {

    public int rob(int[] nums) {

        if(nums.length == 0)
        {
            return 0;
        }

        int dp[] = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            dp[i + 1] = Math.max(dp[i], dp[i-1] + nums[i]);
        }
        for(int i = 0; i < nums.length; i++)
        {
           System.out.println(dp[i]);
        }

        return dp[nums.length];
        
    }

}

class HouseRobberDemo
{
    public static void main(String args[])
    {
        int nums[] = {1,2,3,1,1,100}; 
        HouseRobber hr = new HouseRobber();
        System.out.println(hr.rob(nums));
    }
}

// dynamic programming from youtube
