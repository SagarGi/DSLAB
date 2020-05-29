public class ReverseBits {
    public int reverseBits(int n) {
        int iterator = 32;
        int reverse = 0;
        for(int i = 0; i < iterator; i++)
        {
            reverse <<= 1; //left shift by 1
            reverse = reverse + n % 2;
            n >>>= 1;
        }
        return reverse;
    }
}

class ReverseBitsDemo
{
    public static void main(String[] args) {
        ReverseBits rb = new ReverseBits();
        int n = 14;
        System.out.println(rb.reverseBits(n));
    }
}