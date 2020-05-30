import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElements {
    public List<Integer> majorityElement(int[] numbers) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : numbers)
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

        for(Integer i : map.keySet())
        {
            if(map.get(i) > numbers.length / 3)
            {
                list.add(i);
            }
        }
        return list;
    }
}

class MajorityElementDemo
{
    public static void main(String[] args) {
        int numbers[] = {1,1,1,3,3,2,2,2};
        MajorityElements me = new MajorityElements();
        System.out.println(me.majorityElement(numbers));
    }
}