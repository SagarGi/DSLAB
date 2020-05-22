public class NumArray
{
    int nums[];
    int i;
    int j;
    public NumArray(int nums[])
    {
        this.nums = nums;
        this.i = 0;
        this.j = nums.length;
    }

    public void update(int i , int val)
    {
        this.i = i;
        for(int a = 0; a < nums.length; a++)
        {
            if(val == nums[a])
            {
                j = a + 1;
            }
        }
    }

    public int sumRange(int i , int j)
    {
        int sum = 0;
        for(int a = i; a < j; a++)
        {
            sum = sum + nums[a];
        }
        return sum;
    }
}

class NumArrayDemo
{
    public static void main(String args[])
    {
        int nums[] = {1,2,4,9};
        NumArray na = new NumArray(nums);
        System.out.println(na.sumRange(na.i, na.j));
        na.update(1, 4);
        System.out.println(na.sumRange(na.i, na.j));
    }
}