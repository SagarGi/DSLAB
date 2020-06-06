import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        char ch[] = s.toCharArray();
        for(char c : ch)
        {
            if(!map.containsKey(c))
            {
                map.put(c, 1);
            }
            else
            {
                map.put(c, map.get(c) + 1);
            }
        }

        char chh[] = t.toCharArray();

      for(char c : chh)
      {
            if(!map.containsKey(c))
            {
                return c;
            }
            else if(map.containsKey(c) && map.get(c) == 0)
            {
                return c;
            }
            else
            {
                map.put(c, map.get(c) - 1);
            }
      }

        return ' ';
    }
}

class FindTheDifferenceDemo
{
    public static void main(String[] args) {

        String s = "aa";
        String t = "aaaa";
        FindTheDifference fd = new FindTheDifference();
        System.out.println(fd.findTheDifference(s, t));
        
    }
}