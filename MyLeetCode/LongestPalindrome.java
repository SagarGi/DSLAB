class LongestPalindrome
{
    public String reverseString(String string)
    {
       StringBuilder stringBuilder = new StringBuilder(string);
       return stringBuilder.reverse().toString();
    }

    public String longestPalindrome(String s) {

        String ans = "";
        
        if(s.length() == 0 || s.length() == 1)
        {
            return s;
        }
        if(s.length() > 1)
        {
            ans = String.valueOf(s.charAt(0));
            for(int i = 0; i < s.length() - 1; i++)
            {
                String temp = String.valueOf(s.charAt(i));

                for(int j = i + 1; j < s.length(); j++)
                {
                   temp = temp + s.charAt(j);
                   if(temp.equals(reverseString(temp)))
                   {
                       ans = temp;
                   }
                  
                }

                if(temp == ans)
                {
                    break;
                }
            }
        }
        return ans;
    }
}

class LongestPalindromeDemo
{
    
    public static void main (String args[])
    {
        String s = "abadd";
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindrome(s));
    }
}

//  fails some of the test cases
