import java.util.ArrayList;
import java.util.List;

public class AnagramInString
{
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int pLength = p.length();
        List<Character> charList = new ArrayList<>();
        for(Character c : p.toCharArray())
        {
            charList.add(c);
        }

        for(int i = 0; i <= s.length() - pLength; i++)
        {
            int k = i;
            int j = pLength;
            boolean contains = true;
            List<Character> tempList = new ArrayList<Character>(charList);
            while(j > 0)
            {
                if(tempList.contains(s.charAt(k)))
                {
                    for(Character c : tempList)
                    {
                        if(c.equals(s.charAt(k)))
                        {
                            tempList.remove(c);
                            break;
                        }
                    }
                }
                else
                {
                    contains = false;
                    break;
                }
                j--;
                k++;
            }
          
            if(contains == true)
            {
                list.add(i);
            }
        }
        return list;
    }
}

class AnagramInStringDemo
{
    public static void main(String[] args) {
        String s= "abab";
        String p = "ab";
        AnagramInString as = new AnagramInString();
        System.out.println(as.findAnagrams(s, p));
    }
}

//  my solution runtime exceeds
