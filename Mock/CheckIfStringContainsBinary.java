public class CheckIfStringContainsBinary {
    public String toBinary(int num, int length)
    {
        if (length > 0) {
			return String.format("%" + length + "s",
							  Integer.toBinaryString(num)).replaceAll(" ", "0");
		}

		return null;
    }

    

    public boolean hasAllCodes(String s, int k) {

        if(s.contains("0000000"))
        {
            System.out.println("yes");
        }

        if(k == 1)
        {
           if(!(s.contains("0") && s.contains("1")))
           {
               return false;
           }
        }
        for(int i = 0; i < Math.pow(2, k); i++)
        {
            System.out.println(toBinary(i, k));
            if(!(s.contains(toBinary(i, k))))
            {
                return false;
            }
        }

        return true;
    }
}

class CheckIfStringContainsBinaryDemo
{
    public static void main(String[] args) {
        String s = "10";
        int k = 1;
        CheckIfStringContainsBinary c = new CheckIfStringContainsBinary();
        System.out.println(c.hasAllCodes(s, k));
    }
}