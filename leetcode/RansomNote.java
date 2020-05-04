import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] strArray = magazine.toCharArray(); 
        for(char c : strArray)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
            }
            else
            {
                map.put(c, 1);
            }
        }

        System.out.println(map);
        char[] strransom = ransomNote.toCharArray(); 
        for(char c : strransom)
        {
            if(map.containsKey(c) && map.get(c) > 0)
            {
                result = true;
            }
            else
            {
                result = false;
                break;
            }
            map.put(c, map.get(c) - 1);

        }
        System.out.println(map);


        return result;
       
    }
}


class RansomNoteDemo
{
    public static void main(String arg[])
    {
        String ransomNote = "aa";
        String magazine = "";
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct(ransomNote, magazine));
    }
}