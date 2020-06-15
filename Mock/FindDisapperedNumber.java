import java.util.ArrayList;
import java.util.List;

public class FindDisapperedNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        int countArray[] = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++)
        {
            countArray[nums[i]]++;
        }

        for(int i = 1; i < nums.length; i++)
        {
            if(countArray[i] == 0)
            {
                list.add(i);
            }
        }
        
        
        return list;
    }
}

class FindDisapperedNumberDemo
{
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        FindDisapperedNumber fdn = new FindDisapperedNumber();
        System.out.println(fdn.findDisappearedNumbers(nums));
    }
}