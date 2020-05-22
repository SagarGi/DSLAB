public class ValidPalindromeII {

    // public String reverse(String str)
    // {
    //     StringBuilder s = new StringBuilder(str);
    //     return s.reverse().toString();
    // }

    // public boolean validPalindrome(String s) {
    //     if(s.length() == 0)
    //     {
    //         return false;
    //     }
    //     if(s.length() == 1)
    //     {
    //         return true;
    //     }

    //     else
    //     {
    //        if(s.equals(reverse(s)))
    //        {
    //            return true;
    //        }  
    //        else
    //        {
    //            for(int i = 0; i < s.length(); i++)
    //            {
    //                String string = "";
    //                for(int j = 0; j < s.length(); j++)
    //                {
    //                    if(i == j)
    //                    {
    //                        continue;
    //                    }
    //                    else
    //                    {
    //                        string = string + s.charAt(j);
    //                    }
    //                }

    //                if(string.equals(reverse(string)))
    //                {
    //                    return true;
    //                }
    //            }
    //        }
    //     }

    //     return false;

    // the above code exceeds time limit 
    

    public boolean validPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while(start <= end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return checkPalindromeSkipingOneChar(s,start + 1, end) || checkPalindromeSkipingOneChar(s,start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean checkPalindromeSkipingOneChar(String s,int i, int j)
    {
        int start = i;
        int end = j;

        while(start <= end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

class ValidPalindromeIIDemo
{
    public static void main(String[] args) {
        String s = "abca";
        ValidPalindromeII v = new ValidPalindromeII();
        System.out.println(v.validPalindrome(s));
    }
}