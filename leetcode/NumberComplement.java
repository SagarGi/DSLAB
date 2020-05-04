import java.math.BigInteger;

public class NumberComplement {

    public int findComplement(int num) {
        int ans = 0;
        String strNum = Integer.toBinaryString(num);
        String newString = "";
        for(int i = 0; i < strNum.length(); i++)
        {
            if(strNum.charAt(i) == '0')
            {
                newString = newString + "1";
            }
            else
            {
                newString = newString + "0";
            }
        }

        ans = Integer.parseInt(newString, 2);

        System.out.println(strNum);
        System.out.println(newString);
        return ans;
        
    }
    
}

class NumberComplementDemo
{
    public static void main(String args[])
    {
        NumberComplement nc = new NumberComplement();
        int num = 1;
        System.out.println(nc.findComplement(num));
    }
}