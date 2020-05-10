import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KDiffPair {
    public int findPairs(int[] nums, int k) {
        int ans = 0;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = nums.length - 1; i > 0; i--)
        {
            for(int j = i - 1; j >= 0; j--)
            {
                if(nums[i] - nums[j] == k)
                {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    if(!list.contains(l))
                    {
                        list.add(l);
                    }
                }
            }
        }
        ans = list.size();
        return ans;
        
    }
}

class KDiffPairDemo
{
    public static void main(String[] args) {
        int nums[] = {3,1,4,1,5,5,1,1};
        int k = 0;
        KDiffPair kf = new KDiffPair();
        System.out.println(kf.findPairs(nums, k));
    }
}