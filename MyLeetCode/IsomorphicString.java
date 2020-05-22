
public class IsomorphicString {

    public boolean isIsomorphicString(String s, String t)
    {
        boolean result = false;
        int sizeOne = s.length();
        int sizeTwo = t.length();
        int k = 0;
        if(sizeOne != sizeTwo)
        {
            result = false;
        }
        else
        {
            while(k < 2)
            {
                int countOne = 0;
                int countTwo = 0;
                for(int i = k; i < sizeOne; i++)
                {
                    if(s.charAt(k) == s.charAt(i) )
                    {
                        countOne++;
                        // System.out.println("right");
                    }
                    else
                    {
                        break;
                    }

                    if(t.charAt(k) == t.charAt(i))
                    {
                        countTwo++;
                    }
                    else
                    {
                        break;
                    }
                }

                // System.out.println(countOne);
                // System.out.println(countTwo);

                if(countOne == countTwo)
                {
                    result = true;
                    k = k + countOne;
                }
                else
                {
                    result = false;
                    break;
                }
                
                // System.out.println("k = " + k);
            
            }

            // System.out.println(result);
            
        }
        return result;
    }

}

class IsomorphicStringDemo
{
    public static void main(String args[])
    {
        String s = "foo";
        String t = "bar";
        IsomorphicString is = new IsomorphicString();
        System.out.println(is.isIsomorphicString(s, t));
        // is.isIsomorphicString(s, t);
    }
}

// works fine but not optimized