public class NumberOfBits {
    public int hammingWeight(int n) {
        int count = 0;

        while(n != 0)
        {
            if((n & 1) == 1)
            {
                count++;
            }

            n =  n >>> 1;
        }
      
        return count;
    }
}

class NumberOfBitsDemo
{
    public static void main(String[] args) {
        int n = 11;
        NumberOfBits nb = new NumberOfBits();
       System.out.println(nb.hammingWeight(n));
    }
}