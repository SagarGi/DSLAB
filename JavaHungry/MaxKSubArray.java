public class MaxKSubArray
{
    public int maxKSubArray(int nums[], int k)
    {
        int max = 0;
        for(int i = 0; i <= nums.length - k; i++)
        {
            int sum = 0;
            int j = 0;
            while(j < k)
            {
                sum = sum + nums[i + j];
                j++;
            }
            if(sum > max)
            {
                max = sum;
            }
        }
        return max;
    }
}

class MaxKSubArrayDemo
{
    public static void main(String[] args) {
        int nums[] = {1,6,2,3,4,1};
        int k = 3;
        MaxKSubArray max = new MaxKSubArray();
        System.out.println(max.maxKSubArray(nums , k));
    }
}