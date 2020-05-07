import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourSome {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length - 3; i++)
        {
            for(int j = i + 1; j < nums.length -2; j++)
            {
                for(int k = j + 1; k < nums.length -1; k++)
                {
                    for(int m = k + 1; m < nums.length; m++)
                    {
                        if((nums[i] + nums[j] + nums[k] + nums[m]) == target)
                        {
                            List<Integer> l = new ArrayList<>();
                            l.add(nums[i]);
                            l.add(nums[j]);
                            l.add(nums[k]);
                            l.add(nums[m]);
                            Collections.sort(l);
                            if(!list.contains(l))
                            {
                                list.add(l);
                            }
                        }
                    }
                }
            }
        }

        return list;

    }
    
}

class FourSomeDemo
{
    public static void main(String[] args) {
        FourSome fs = new FourSome();
        int [] nums = {-3,-1,0,2,4,5};
        int target = 2;
        System.out.println(fs.fourSum(nums, target));
    }
}

//brute force but doesnt work
