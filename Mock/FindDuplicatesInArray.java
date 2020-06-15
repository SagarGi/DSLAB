import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int newArray[] = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++)
        {
            newArray[nums[i]]++;
        }

        for(int i = 1; i < newArray.length; i++)
        {
            if(newArray[i] > 1)
            {
                list.add(i);
            }
        }
        return list;
    }
}

class FindDuplicatesInArrayDemo
{
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        FindDuplicatesInArray fd = new FindDuplicatesInArray();
        System.out.println(fd.findDuplicates(nums));

    }
}