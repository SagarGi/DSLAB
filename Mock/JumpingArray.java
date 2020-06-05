public class JumpingArray {
    public int jumpArray(int [] array)
    {
        if(array.length <= 1)
        {
            return 0;
        }
       
        // using dynamic programming
        int dp[] = new int[array.length];
        dp[0] = 0;

        for(int i = 1; i < array.length; i++)
        {
            // we place max jump value
            dp[i] = Integer.MAX_VALUE;
            for(int j = 0; j < i; j++)
            {
                if(i <= j + array[j] && dp[j] != Integer.MAX_VALUE)
                {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                    break;
                }
            }
        }
        return dp[array.length - 1];
    }
}

class JumpingArrayDemo
{
    public static void main(String[] args) {
        int array[] = {1,4,3,7,1,2,6,7,6,10};
        JumpingArray ja = new JumpingArray();
        System.out.println(ja.jumpArray(array));

    }
}