public class PerfectSquare
{
    public boolean isPerfectSquare(int num) {
        boolean ans = true;
        double firsrRes = (double)Math.pow(num, 0.5);
        float secondRes = (float)Math.pow(num,0.5);
        if(firsrRes != secondRes)
        {
            ans = false;
        }
        // System.out.println(firsrRes);
        // System.out.println(secondRes);
        return ans;
        
    }

    public boolean isPerfectSquareByBinarySearch(int num)
    {
        
        if(num == 1)
        {
            return true;
        }
        long start = 1;
        long end = num / 2;
        while(start <= end)
        {
            long mid = start + (end - start) / 2;
            if(mid * mid == num)
            {
                return true;
            }
            else if(mid * mid > num)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return false;
    }
}

class PerfectSquareDemo
{
    public static void main(String[] args) {
        int num = 10;
        PerfectSquare ps = new PerfectSquare();
        System.out.println(ps.isPerfectSquareByBinarySearch(num));

    }
}