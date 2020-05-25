public class TwoSum
{
    public int[] twoSum(int[] nums, int target) 
    {
        int indices[] = new int[2];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {

                if(nums[i] == nums[j])
                {
                    break;
                }
                else
                {
                    if((nums[i] + nums[j]) == target)
                    {
                        indices[0] = i;
                        indices[1] = j;
                        break;
                    }
                }
            }
        }

        return indices;
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        TwoSum ts = new TwoSum();
        int finalIndex[] = ts.twoSum(nums, 26);
        if(finalIndex[0] == 0 && finalIndex[1] == 0)
        {
            System.out.println("cannot use same number twice!!");
        }
        else
        {
            for(int i = 0; i < 2; i++)
            {
               System.out.println(finalIndex[i]);
            }
        }
        

    } 
}