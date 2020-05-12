public class MoveZeroSecond {
    public void moveZeroes(int[] nums) {
        // understanding it from discussion

        int countZero = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[countZero] = nums[i];
                countZero++;
            }
        }

        while(countZero < nums.length)
        {
            nums[countZero] = 0;
            countZero++;
        }

        for(Integer i : nums)
        {
            System.out.println(i);
        }
    }
}

class MoveZeroSecondDemo
{
    public static void main(String[] args) {
        MoveZeroSecond mz = new MoveZeroSecond();
        int nums[] = {0,1,0,3,12};
        mz.moveZeroes(nums);
    }
}