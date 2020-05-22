public class SingleElementArray {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(start == end)
            {
                return nums[start];
            }
            else if(mid % 2 == 0)
            {
                if(nums[mid] == nums[mid + 1])
                {
                    start = mid + 2;
                }
                else
                {
                    end = mid;
                }
            }
            else 
            {
                if(nums[mid] == nums[mid -1])
                {
                    start = mid + 1;

                }
                else
                {
                    end = mid -1;
                }
            }
        }
        return 0;
    }
}

class SingleElementArrayDemo
{
    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4,8,8};
        SingleElementArray s = new SingleElementArray();
        System.out.println(s.singleNonDuplicate(nums));
    }
}