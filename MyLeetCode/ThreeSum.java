import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++)
        {
            if(i == 0 || nums[i] > nums[i - 1])
            {
                int first = i + 1;
                int last = nums.length - 1; 
                while(first < last)
                {
                    int sum = nums[first] + nums[last];
                    if(sum + nums[i] == 0)
                    {
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[first]);
                        l.add(nums[last]);
                        list.add(l);
                    }
                    // System.out.println(sum + nums[i]);

                    if(sum + nums[i] < 0)
                    {
                        int prevFirst = first;
                        while(nums[first] == nums[prevFirst] && first < last)
                        {
                            first++;
                        }
                    }
                    else
                    {
                        int prevLast = last;
                        while(nums[last] == nums[prevLast] && first < last)
                        {
                            last--;
                        }
                    }
                }
            }
        }

        return list;
        
    }
}

class ThreeSumDemo
{
    public static void main(String[] args) {

        int [] nums = {-1,0,1,2,-1,-4};
        ThreeSum rs = new ThreeSum();
        System.out.println(rs.threeSum(nums));
        
    }
}