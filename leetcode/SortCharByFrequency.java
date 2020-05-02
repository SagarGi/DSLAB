import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Comparator;

public class SortCharByFrequency {

    public String frequencySort(String s) {

    HashMap<Integer, Character> map = new HashMap<Integer, Character>();

      for(int i = 0; i < 2; i++)
      {
          int count = 0;
         if(!map.containsValue(s.charAt(i)))
         {
            for(int j = 0; j < s.length(); j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    count++;
                }
            }
            map.put(count, s.charAt(i));
         }
         else
         {
             continue;
         }  
      }

      System.out.println(map);

      LinkedHashMap<Integer, Character> sorted = new LinkedHashMap<>();
      map.entrySet()
      .stream()
      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
      .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));
      
    return "";

    }
    
}

class SortCharByFrequencyDemo
{
    public static void main (String args[])
    {
        String s = "aberrr";
        SortCharByFrequency sf = new SortCharByFrequency();
        System.out.println(sf.frequencySort(s));
    }
}

// to be continue;