
public class AddBinary {

    public void  addBinary(String a, String b)
    {
        
        String sum = new String();
        int aSize = a.length();
        int bSize = b.length();
        int carry = 0;
        //  making the string of same size by adding zero
        if(aSize > bSize)
        {
            String newb = "";
            for(int i = 0; i < (aSize-bSize); i++)
            {
                newb = newb + "0";
            }
            b = newb + b;
        }
        else if(aSize < bSize)
        {
            String newa = "";
            for(int i = 0; i < (bSize- aSize); i++)
            {
                newa = newa + "0";
            }
            a = newa + a;
        }
        // System.out.println(a);
        // System.out.println(b);

        // now adding the binary number

        for(int i = aSize-1; i >= 0; i--)
        {
            // System.out.println(a.charAt(i));
            // System.out.println(b.charAt(i));
            System.out.println(carry);
            if(carry == 0)
            {
                if(carry == 0 && i == 0)
                {
                    if(a.charAt(i) == '0' && b.charAt(i) == '0')
                    {
                        sum = "0" + sum;
                       
                    }
                    else if(a.charAt(i) == '1' && b.charAt(i) == '0')
                    {
                        sum =  "1" + sum ;
                      
                    }
                    else if(a.charAt(i) == '0' && b.charAt(i) == '1')
                    {
                        sum = "1"+ sum;
                    
                    }
                    else if(a.charAt(i) == '1' && b.charAt(i) == '1')
                    {
                        sum = "11" + sum;
                       
                    }
                }
                else
                {
                    if(a.charAt(i) == '0' && b.charAt(i) == '0')
                {
                    sum = "0" + sum;
                    carry = 0;
                }
                else if(a.charAt(i) == '1' && b.charAt(i) == '0')
                {
                    sum = "1" + sum;
                    carry = 0;
                }
                else if(a.charAt(i) == '0' && b.charAt(i) == '1')
                {
                    sum = "1" + sum;
                    carry = 0;
                }
                else if(a.charAt(i) == '1' && b.charAt(i) == '1')
                {
                    
                    sum = "0" + sum;
                    carry = 1;
                }
                }
                
            }
            else
            {
                if(carry == 1 && i == 0)
                {
                    if(a.charAt(i) == '0' && b.charAt(i) == '0')
                    {
                        sum = "1" + "0" + sum;
                       
                    }
                    else if(a.charAt(i) == '1' && b.charAt(i) == '0')
                    {
                        sum = "1" + "0" + sum ;
                      
                    }
                    else if(a.charAt(i) == '0' && b.charAt(i) == '1')
                    {
                        sum = "1" + "0" + sum;
                    
                    }
                    else if(a.charAt(i) == '1' && b.charAt(i) == '1')
                    {
                        sum = "1" +"1" + sum;
                       
                    }
                }
                else{

                    if(a.charAt(i) == '0' && b.charAt(i) == '0')
                    {
                        sum = "1" + sum;
                        carry = 0;
                    }
                    else if(a.charAt(i) == '1' && b.charAt(i) == '0')
                    {
                        sum = "0" + sum;
                        carry = 1;
                    }
                    else if(a.charAt(i) == '0' && b.charAt(i) == '1')
                    {
                        sum ="0" + sum;
                        carry = 1;
                    }
                    else if(a.charAt(i) == '1' && b.charAt(i) == '1')
                    {
                        sum = "1" + sum;
                        carry = 1;
                    }

                }
            }
            System.out.println(carry);
        }
        System.out.println("carry after loop = " + carry);
        System.out.println(sum);
       
       
    }

}

class AddBinaryDemo
{
    public static void main(String args[])
    {
        AddBinary ab = new AddBinary();
        ab.addBinary("11", "1");
    }
}
