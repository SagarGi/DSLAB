public class RemovesDuplicateFromSortedArray
{
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int j = i;

            while(j < nums.length && nums[i] == nums[j])
            {
                j++;
            }
            nums[result++] = nums[i];
            i = j - 1;
        }
        return result;
    }
}

class RemoveDuplicateFromSortedArrayDemo
{
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        RemovesDuplicateFromSortedArray r = new RemovesDuplicateFromSortedArray();
        System.out.println(r.removeDuplicates(nums));
    }
}