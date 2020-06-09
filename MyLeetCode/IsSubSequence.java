import java.util.ArrayList;
import java.util.List;

public class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int i = 0;
        int j = 0;
        if(s.length() == 0)
        {
            return true;
        }
        while(j < t.length() && i < s.length())
        {
            if(t.charAt(j)  == s.charAt(i))
            {
                count++;
                i++;
            }

            j++;
        }

        if(count == s.length())
        {
            return true;
        }
        return false;

    }
}

class IsSubSequenceDemo
{
    public static void main(String[] args) {
        String s = "aaabc";
        String t = "aahbgdc";
        IsSubSequence is = new IsSubSequence();
        System.out.println(is.isSubsequence(s, t));
    }
}