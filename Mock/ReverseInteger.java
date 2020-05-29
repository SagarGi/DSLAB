public class ReverseInteger {
    public int reverse(int x) {
        long reversed = 0;
        // check if the number is negative or not
        boolean negative = false;
        if(x < 0)
        {
            negative = true;
            x = x * (-1);
        }

        while(x > 0)
        {
            reversed = (reversed * 10) + (x % 10);
            x = x / 10;
        }

        if(reversed > Integer.MAX_VALUE)
        {
            return 0;
        }

        System.out.println(reversed);

        if(negative == true)
        {
            reversed = (int)(-1) * reversed;
        }

        return (int)reversed;
    }
}

class ReverseIntegerDemo
{
    public static void main(String[] args) {
        int x = 1534236469;
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(x));
    }
}