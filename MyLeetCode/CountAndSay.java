public class CountAndSay {

    public String countAndSay(int n)
    {
        String result = "";

        // we have to initialize the first 2 terms inorder to generate the other
        String first = "1";
        int k = 0;
      

        if(n == 1)
        {
            result = first;
        }
        else
        {
            while(k < n - 1)
            {
                // System.out.println(first);
                int l = 0;
                String fakeResult = "";
                while(l < first.length())
                {
                    int count = 0;
                    for(int i = l; i < first.length(); i++)
                    {
                        if(first.charAt(l) == first.charAt(i))
                        {
                            count = count + 1;
                        }
                        else
                        {
                            break;
                        }
                    }

                    fakeResult = fakeResult + Integer.toString(count) + first.charAt(l); 
                    l = l + count;
                }
                first = fakeResult;
                k = k + 1;
                result = first;
            }
            // System.out.println(result);
        }

        return result;
    }

}

class CountAndSayDemo
{
    public static void main(String agrs[])
    {
        int n = 10;
        CountAndSay cs = new CountAndSay();
        System.out.println(cs.countAndSay(n));
        // cs.countAndSay(n);
    }
}

// works perfectly fine


