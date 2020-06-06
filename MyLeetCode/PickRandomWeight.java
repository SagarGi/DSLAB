import java.util.Random;

public class PickRandomWeight {
    int sum[];
    int maxValue;
    Random random = new Random();  //it generates random number

    PickRandomWeight(int [] w)
    {
      sum = new int[w.length];
      sum[0] = w[0];
      for(int i = 1; i < w.length; i++)
      {
          int tempsum = sum[i - 1] + w[i];
          sum[i] = tempsum;
      }

      maxValue = sum[sum.length - 1];
    }

    public int pickIndex() {
        
        //  we solve it by using binary search technique

        int start = 0;
        int end = sum.length - 1;
        int target = 1 + random.nextInt(maxValue); // gives random value lesser than max value

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(sum[mid] == target)
            {
                return mid;
            }

            if(sum[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }

        }
        
        return start;
    }
    
}

class PickRandomWeightDemo
{
    public static void main(String[] args) {
        int w [] = {1,2,4};
        PickRandomWeight pick = new PickRandomWeight(w);
        System.out.println(pick.pickIndex());
    }
}