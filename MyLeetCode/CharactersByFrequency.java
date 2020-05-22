import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharactersByFrequency
{
    public String frequencySort(String s) {
        // we find the frequency of the each character in string
        String ans = "";
        if(s.length() == 0)
        {
            return ans;
        }
       
        HashMap<Character, Integer> map = new HashMap<>();

        char []ch = s.toCharArray();
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

        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
        .forEachOrdered(x -> linkedHashMap.put(x.getKey(), x.getValue()));

        for(Character i : linkedHashMap.keySet())
        {
                for(int j = 0; j < linkedHashMap.get(i); j++)
                {
                    ans = ans + i;
                }
        }
        System.out.println(linkedHashMap);
        return ans;

    }
}

class CharacterByFrequencyDemo
{
    public static void main(String[] args) {
        CharactersByFrequency cbf = new CharactersByFrequency();
        String s = "aaAAa";
        System.out.println(cbf.frequencySort(s));
    }
}

