import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Comparator;

public class SortCharByFrequency {

    public String frequencySort(String s) {

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

      for(int i = 0; i < s.length(); i++)
      {
          int count = 0;
         if(!map.containsKey(s.charAt(i)))
         {
            for(int j = i; j < s.length(); j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    count++;
                }
            }
           
            map.put(s.charAt(i), count);
           
         }
         else
         {
             continue;
         }  
      }
      LinkedHashMap<Character, Integer> sorted = new LinkedHashMap<>();
      map.entrySet()
      .stream()
      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
      .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));

    //   System.out.println(sorted);
      Set<Character> letter = sorted.keySet(); 
      Collection<Integer> freq = sorted.values();
      Iterator<Integer> it = freq.iterator();
      String result = "";
      int frequency[] = new int[freq.size()]; 
      int k = 0;
      while (it.hasNext()) 
     {
        frequency[k] = it.next();
        k = k + 1;
     } 
     int j = 0;
     
      for(Character c : letter)
      {
          for(int i = 0; i < frequency[j]; i++)
          {
            result = result + c;
          }
          j++;
      }
    return result;

    }
    
}

class SortCharByFrequencyDemo
{
    public static void main (String args[])
    {
        String s = "tree";
        SortCharByFrequency sf = new SortCharByFrequency();
        System.out.println(sf.frequencySort(s));
    }
}

// to be continue;