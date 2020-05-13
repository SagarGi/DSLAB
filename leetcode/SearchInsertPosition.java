public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = (start + end)  / 2;
            System.out.println(mid);
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(start == end)
            {
                if(nums[mid] > target)
                {
                    return mid;
                }
                else
                {
                    return mid + 1;
                }
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                
                end = mid;
            }

            // System.out.println(end);
        }

        return -1;
    }
}

class SearchInsertPositionDemo
{
    public static void main(String[] args) {
        int nums[] = {1,3,5,8};
        int target = 6;
        SearchInsertPosition sp = new SearchInsertPosition();
        System.out.println(sp.searchInsert(nums, target));
    }
}