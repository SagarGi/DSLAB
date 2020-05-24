import java.util.ArrayList;
import java.util.List;

public class MaxNumberVowels {
    public int maxVowels(String s, int k) {
        List<Character> l = new ArrayList<>();
        l.add('a');
        l.add('e');
        l.add('i');
        l.add('o');
        l.add('u');
       int max = 0;
       for(int i = 0; i < k; i++)
       {
           if(l.contains(s.charAt(i)))
           {
               max++;
           }
       }

       int ans = max;
       for(int i = k; i < s.length(); i++)
       {
            if(l.contains(s.charAt(i)))
            {
                max++;
            }

            if(l.contains( s.charAt(i - k)))
            {
                max--;
            }

            ans = Math.max(ans, max);

       }
        return ans;
    }
}

class MaxNumberVowelsDemo
{
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        MaxNumberVowels m = new MaxNumberVowels();

        System.out.println(m.maxVowels(s, k));
    }
}

// update from discussion 
