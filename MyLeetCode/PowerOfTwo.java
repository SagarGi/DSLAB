public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        boolean ans = false;
        int k = 0;
        double result = 0;
        while(result <= n)
        {
           double power = Math.pow(2, k); 
           if(power == n)
           {
               ans = true;
           }
           result = power;
          k = k + 1;
        }
        return ans;
    }
    
}

class PowerOfTwoDemo
{
    public static void main(String args[])
    {
        int n = 16;
        PowerOfTwo pt = new PowerOfTwo();
        System.out.println(pt.isPowerOfTwo(n));
    }
}