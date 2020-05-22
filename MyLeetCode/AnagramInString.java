
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramInString
{
    public List<Integer> findAnagrams(String s, String p) {
        // List<Integer> list = new ArrayList<>();
        // int pLength = p.length();
        // List<Character> charList = new ArrayList<>();
        // for(Character c : p.toCharArray())
        // {
        //     charList.add(c);
        // }

        // for(int i = 0; i <= s.length() - pLength; i++)
        // {
        //     int k = i;
        //     int j = pLength;
        //     boolean contains = true;
        //     List<Character> tempList = new ArrayList<Character>(charList);
        //     while(j > 0)
        //     {
        //         if(tempList.contains(s.charAt(k)))
        //         {
        //             for(Character c : tempList)
        //             {
        //                 if(c.equals(s.charAt(k)))
        //                 {
        //                     tempList.remove(c);
        //                     break;
        //                 }
        //             }
        //         }
        //         else
        //         {
        //             contains = false;
        //             break;
        //         }
        //         j--;
        //         k++;
        //     }
          
        //     if(contains == true)
        //     {
        //         list.add(i);
        //     }
        // }
        // return list;


        // learned from refrences

       
        int[] sFrequency = new int[26];
        int [] pFrequency = new int[26];

        // frequency array for string s

        List<Integer> listInteger = new ArrayList<>();
        if(p.length() > s.length())
        {
            return listInteger;
        }

        for(int i = 0; i < p.length(); i++)
        {
            sFrequency[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < p.length(); i++)
        {
            pFrequency[p.charAt(i) - 'a']++;
        }

        int pLength = p.length();
        int sLength = s.length();
        

        for(int i = pLength; i < sLength; i++)
        {
            if(Arrays.equals(sFrequency, pFrequency))
            {
                listInteger.add(i - pLength);
            }

            sFrequency[s.charAt(i)-'a']++;
            sFrequency[s.charAt(i-pLength)-'a']--;
        }

        if(Arrays.equals(sFrequency, pFrequency))
        {
            listInteger.add(sLength - pLength);
        }
        return listInteger;
    }
}

class AnagramInStringDemo
{
    public static void main(String[] args) {
        String s= "";
        String p = "a";
        AnagramInString as = new AnagramInString();
        System.out.println(as.findAnagrams(s, p));
    }
}

//  my solution runtime exceeds but works
