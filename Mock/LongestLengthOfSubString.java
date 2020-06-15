import java.util.ArrayList;
import java.util.List;

public class LongestLengthOfSubString
{
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        if(s.length() == 1)
        {
            return 1;
        }
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length() - 1; i++)
        {
            int tempCount = 0;
            int k = i + 1;
            list.add(s.charAt(i));
            tempCount++;
            while(k < s.length() && !list.contains(s.charAt(k)))
            {
                list.add(s.charAt(k));
                tempCount++;
                k++;
            }

            list.clear();

            count = Math.max(count, tempCount);
        }
        return count;
    }
}

class LongestLengthOfSubStringDemo
{
    public static void main(String[] args) {
        String s = "pwwkew";
        LongestLengthOfSubString ll = new LongestLengthOfSubString();
        System.out.println(ll.lengthOfLongestSubstring(s));

    }
}