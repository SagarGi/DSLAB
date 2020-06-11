public class ColorSort {
    public void sortColors(int[] nums) {
        int array[] = new int[3];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                array[0]++;
            }
            else if(nums[i] == 1)
            {
                array[1]++;
            }
            else
            {
                array[2]++;
            }
        }

        int k = 0;
       for(int i = 0; i < array.length; i++)
       {
           for(int j = 0; j < array[i]; j ++)
           {
                nums[k++] = i;
           }
        }
    }
}
class ColorSortDemo
{
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        ColorSort cs = new ColorSort();
        cs.sortColors(nums);
        for(Integer i : nums)
        {
            System.out.print(i + "");
        }
    }
}