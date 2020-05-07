import java.util.ArrayList;
import java.util.Arrays;
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
                    //    mainlist.add(new ArrayList<Integer>(Arrays.asList(nums[0], 
                    //    nums[1], 
                    //    nums[2],
                    //    nums[j]
                    //    )));
                    List<Integer> listk = new ArrayList<>();
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

// works but gives duplicate value
