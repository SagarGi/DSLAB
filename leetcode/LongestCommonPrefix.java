public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String ans = "";
        int length = Integer.MAX_VALUE;
        if(strs.length == 1)
        {
            length = strs[0].length();
        }
        else if(strs.length == 0)
        {
            length = 0;
        }
        else
        {
            for(String s : strs)
            {
                if(s.length() < length)
                {
                    length = s.length();
                }
            }
        }

        System.out.println(length);
    
        
        for(int i = 0; i < length; i++)
        {
           char first = strs[0].charAt(i);
           boolean result = true;
           for(String s : strs)
           {
               if(!(s.charAt(i) == first))
               {
                result = false;
                break;
               }
           }

           if(result == true)
           {
               ans = ans + first;
           }
           else
           {
               break;
           }

        }
        return ans;
        
    }
    
}

class LongestCommonPrefixDemo
{
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        LongestCommonPrefix pcp = new LongestCommonPrefix();
        System.out.println(pcp.longestCommonPrefix(strs));
    }
}

// to be continue