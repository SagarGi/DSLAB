import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class FindCommonCharacters
{
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        char ch [] = A[0].toCharArray();
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

        HashMap<Character, Integer> tempMap = new HashMap<>();
        for(int i = 1; i < A.length; i++)
        {
            char chh[] = A[i].toCharArray();
            HashMap<Character, Integer> m2 = new HashMap<>();
            for(char c : chh)
            {
                if(map.containsKey(c) && map.get(c) != 0) 
                {
                   map.put(c, map.get(c) - 1);
                   if(!m2.containsKey(c))
                   {
                    m2.put(c, 1);
                   }
                   else
                   {
                    m2.put(c, m2.get(c) + 1);
                   }
                }
            }

            map = m2;
            tempMap = m2;
        }

        for(char c : tempMap.keySet())
        {
            int freq = tempMap.get(c);
            for(int i = 0; i < freq; i++)
            {
                list.add(String.valueOf(c));
            }
        }
        return list;
    }
}

class FindCommonCharactersDemo
{
    public static void main(String[] args) {
        FindCommonCharacters fcc = new FindCommonCharacters();
        String A[] = {"label", "bella", "roller"};
        System.out.println(fcc.commonChars(A));
    }
}

// find common character it exceeds time limit