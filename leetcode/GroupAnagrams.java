import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        // create a hash table
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(!map.containsKey(key))
            {
                    map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        // System.out.println(map);
        list.addAll(map.values());
        return list;
    }
}
class GroupAnagramsDemo
{
    public static void main(String[] args) {
        String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams ga = new GroupAnagrams();
        System.out.println(ga.groupAnagrams(strs));
    }
}