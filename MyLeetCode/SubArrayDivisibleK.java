import java.util.HashMap;

public class SubArrayDivisibleK {
    public int subarraysDivByK(int[] A, int K) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int cumulativeSum = 0;

        for(int i = 0; i < A.length; i++)
        {
            cumulativeSum += A[i];
            // take out the remainder
            int remainder = cumulativeSum % K;

            // remainders can be negative so 
            if(remainder < 0)
            {
                remainder = remainder + K;
            }
            if(map.containsKey(remainder))
            {
                count = count + map.get(remainder);
                map.put(remainder, map.get(remainder) + 1);
            }
            else
            {
                map.put(remainder, 1);
            }
        }

        return count;
    }
}

class SubArrayDivisibleKDemo
{
    public static void main(String[] args) {
        int K = 5;
        int A[] = {4,5,0,-2,-3,1};
        SubArrayDivisibleK sdk = new SubArrayDivisibleK();
        System.out.println(sdk.subarraysDivByK(A, K));
    }
}