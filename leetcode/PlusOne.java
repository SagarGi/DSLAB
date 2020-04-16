
public class PlusOne {

    public int[] plusOne(int[] digits)
    {
        int result[] = new int[digits.length];
        int digitsSize = digits.length;
        for(int i = 0; i < digits.length; i++)
        {
            if(i == (digitsSize -1))
            {
                result[i] = digits[i] + 1;
            }
            else
            {
                result[i] = digits[i];
            }
        }
        return result;
    }


}

class PlusOneDemo
{
    public static void main(String args[])
    {
        int digits[] = {4,3,2,1};
        PlusOne po = new PlusOne();
        int result[] = po.plusOne(digits);
        
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
}