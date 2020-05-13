import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {
    public int findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(!list.contains(nums[i]))
            {
                list.add(nums[i]);
            }
            else
            {
                return nums[i];
            }
        } 

        System.out.println(list);
        return 0;
    }
}

// the above take more space 

class DuplicateNumbersDemo
{
    public static void main(String[] args) {
        int nums[] = {1,3,4,2,2};
        DuplicateNumbers dn = new DuplicateNumbers();
        System.out.println(dn.findDuplicate(nums));
    }
  
}