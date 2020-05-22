import java.util.ArrayList;
import java.util.List;

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        List<Integer> list = new ArrayList<Integer>();
        int startPointer = 0;
        int endPointer = numbers.length - 1;

        while(startPointer < endPointer)
        {
            if(numbers[startPointer] + numbers[endPointer] == target)
            {
                list.add(startPointer);
                list.add(endPointer);
                break;
            }
            else if(numbers[startPointer] + numbers[endPointer] > target)
            {
                endPointer--;
            }
            else
            {
                startPointer++;
            }
        }
        // System.out.println(list);
        int result [] = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            result[i] = list.get(i);
        }
        return result;
    }
    
}

class TwoSumIIDemo
{
    public static void main(String[] args) {
        int target = 9;
        int numbers[] = {2,7,15,11};
        TwoSumII ts = new TwoSumII();
        int [] result = ts.twoSum(numbers, target);
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
}