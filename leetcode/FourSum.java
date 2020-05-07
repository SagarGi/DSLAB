import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourSum {

public int [] shiftFirstElement(int nums[])
{
    for(int i = 0; i < nums.length -1; i++)
    {
        int temp = nums[i];
        nums[i] = nums[i + 1];
        nums[i + 1] = temp;
    }
    return nums;
}
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> mainlist = new ArrayList<List<Integer>>();
        int k = nums.length -1;
       
            while(k > -1)
            {
                for(int j = 3; j < nums.length; j++)
                {
                    int tempSum = nums[0] + nums[1] + nums[2] + nums[j];
                    if(tempSum == target)
                    {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[0]);
                    list.add(nums[1]);
                    list.add(nums[2]);
                    list.add(nums[j]);

                    Collections.sort(list);
                    if(!mainlist.contains(list))
                    {
                        mainlist.add(list);
                    }
                    }
                }
                shiftFirstElement(nums);
                k--;
            }
         
        return mainlist;
    }
    
}

class FourSumDemo
{
    public static void main(String[] args) {

        int target = 0;
        int nums[] = {1,0,-1,0,-2,2};
        FourSum fs = new FourSum();
        List<List<Integer>> list = fs.fourSum(nums, target);
        System.out.println(list);
        
    }
}

// doest work fine

