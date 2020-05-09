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
}

class PerfectSquareDemo
{
    public static void main(String[] args) {
        int num = 100;
        PerfectSquare ps = new PerfectSquare();
        System.out.println(ps.isPerfectSquare(num));

    }
}