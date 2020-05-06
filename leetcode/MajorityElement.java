
import java.util.HashMap;
public class MajorityElement {

    public int majorityElement(int[] nums) {

        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer i : nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i, 1);
            }
            else
            {
                map.put(i, map.get(i) + 1);
            }
        }

        System.out.println(map);

        for(Integer i : map.keySet())
        {
            if(map.get(i) > (nums.length /2))
            {
                result = i;
            }
        }

        return result;
        
    }
    
}

class MajorityElementDemo
{
    public static void main(String[] args) {
        int nums[] = {3,2,2,2,3,3};
        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(nums));

    }
}