public class KPlace {

    public boolean kLengthApart(int[] nums, int k) {

        boolean result = false;
        int zero = 0;

        for(int i = 0; i < nums.length - 1; i++)
        {
            int count = 0;
            if(nums[i] == 1)
            {
                for(int j = i + 1; j < nums.length; j++)
                {
                    if(nums[j] == 0)
                    {
                        count = count + 1;
                       
                    }
                    else
                    {
                       i = j - 1;
                       break;
                    }
                }
                // System.out.println(i);
                // System.out.println(count);
                if(count >= k)
                {
                    result = true;
                }
                else
                {
                    result = false;
                    break;
                }
            }
            else
            {
                zero = zero + 1;
            }
        }

        System.out.println(zero);

        if(zero + 1 == nums.length)
        {
            result = true;
        }

        return result;
        
    }
    
}

class KPlaceDemo
{
    public static void main(String args[])
    {
        int nums [] = {0,0,0,1,1};
        int k = 2;

        KPlace kp = new KPlace();
        System.out.println(kp.kLengthApart(nums, k));

    }
}