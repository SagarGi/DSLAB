public class LongestPalindromicSubString
{
    public int longest(String s)
    {
        int longest = 0;
        for(int i = 0; i < s.length() - 1; i++)
        {
            int templong = 0;
            for(int j = i + 1; j < s.length(); j++)
            {
               int temp = 0;
               int start = i;
               int end = j;
               boolean palindrome = true;
               while(start < end)
               {
                    if(s.charAt(start) != s.charAt(end))
                    {
                        palindrome = false;
                    }
                    start++;
                    end--;
               }
               if(palindrome)
               {
                  temp = j - i + 1;
               }
               templong = Math.max(temp, templong);
            }

            longest = Math.max(longest, templong);
        }
        return longest;
    }
}

class LongestPalindromicSubStringDemo
{
    public static void main(String[] args) {
        String s = "aaaabbaa";
        LongestPalindromicSubString lss = new LongestPalindromicSubString();
        System.out.println(lss.longest(s));
    }
}