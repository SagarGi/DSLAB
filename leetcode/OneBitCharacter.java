
public class OneBitCharacter {

    public boolean isOneBitCharacter(int [] bits)
    {
        boolean result = false;
        int bitsSize = bits.length;
        int i = 0;

        if(bitsSize == 1)
        {
            if(bits[0] == 0)
            {
                result = true;
            }
        }

        if(bitsSize > 1)
        {
            for(i = 0; i < bitsSize; i++)
            {
                if(bits[i] == 1)
                {
                    if(i == (bitsSize -2))
                    {
                        result = false;
                        break;
                    }
                    else{

                        i = i + 1;
                    }
                   
                }
                else
                {
                    if(i == (bitsSize - 1))
                    {
                        result = true;
                    }
                }
            }

            // System.out.println(i);
        }
        return result;
    }

}

class OneBitCharacterDemo
{
    public static void main(String [] args)
    {
        OneBitCharacter ob = new OneBitCharacter();
        int bits[] = {0,0,1,1,1,0,0};
        boolean result = ob.isOneBitCharacter(bits);
        System.out.println(result);
        // ob.isOneBitCharacter(bits);
    }
}

// it works fine but the code is not fine which is obvious