public class Armstrong {

    public boolean armstrong(int n)
    {
        boolean result = false;
        int number = n;
        int sum = 0;
        while(n > 0)
        {
            int digit = n % 10;
            sum += Math.pow(digit, 3);
            n = n /10;
        }

        System.out.println(sum);
        if(sum == number)
        {
            result = true;
        }

        return result;
    }
    
}

class ArmstrongDemo
{
    public static void main(String args[])
    {
        Armstrong as = new Armstrong();
        int n = 15;
        System.out.println(as.armstrong(n));
    }
}