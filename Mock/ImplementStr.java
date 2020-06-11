public class ImplementStr
{
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        int i = 0;
        int j = 0;
        if(needle.length() == 0)
        {
            return 0;
        }
        while(i < m && i <= m-n)
        {
            
            if(haystack.charAt(i) == needle.charAt(j))
            {
                int tempI = i;
                tempI++;
                j++;
                boolean isEqual = true;
                while(j < n)
                {
                    if(haystack.charAt(tempI) != needle.charAt(j))
                    {
                       
                        isEqual = false;
                    }
                    j++;
                    tempI++;
                }
                if(isEqual == true)
                {
                    return i;
                }
                else
                {
                    j = 0;
                }
            }

            i++;
        }
        return -1;
    }
}

class ImplementStrDemo
{
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        ImplementStr is = new ImplementStr();
        System.out.println(is.strStr(haystack, needle));

    }
}