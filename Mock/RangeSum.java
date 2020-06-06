public class RangeSum {

    int nums [];

    public RangeSum(int nums[])
    {
        this.nums = nums;
    }

    public int sumRange(int i , int j)
    {
        int sum = 0;
        for(int k = i; k <= j; k++)
        {
            sum = sum + nums[k];
        }
        return sum;
    }
    
}

class RangeSumDemo
{
    public static void main(String[] args) {

        int nums[] = {-2, 0, 3, -5, 2, -1};
        RangeSum rs = new RangeSum(nums);
        int i = 0, j = 2;
        System.out.println(rs.sumRange(i, j));
        
    }
}