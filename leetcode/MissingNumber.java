import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i + 1] != nums[i] + 1)
            {
                return nums[i] + 1;
            }
        }
        return 0;
    }
    
}

class MissingNumberDemo
{
    public static void main(String[] args) {
        int nums[] = {2,4};
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(nums));
    }
}