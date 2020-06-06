import java.util.HashMap;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1);
            }
            else
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for(Integer i : map.keySet())
        {
            if(map.get(i) == 1)
            {
                return i;
            }
        }
       
        return 0;
    }
}

class SingleNumberDemo
{
    public static void main(String[] args) {
        int nums [] = {4,1,2,1,2};
        SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumber(nums));
    }
}