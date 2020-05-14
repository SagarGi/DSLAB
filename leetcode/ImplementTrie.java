import java.util.ArrayList;
import java.util.List;

public class ImplementTrie {
    public List<String> list = new ArrayList<>();
    public ImplementTrie()
    {
        this.list = list;
    }

    public void insert(String word)
    {
        list.add(word);
    }

    public boolean search(String word)
    {
        if(list.contains(word))
        {
            return true;
        }
        return false;
    }

    public boolean startsWith(String word)
    {
        for(String s : list)
        {
           String prefix = "";
           if(s.length() >= word.length())
           {
            for(int i = 0; i < word.length(); i++)
            {
                prefix = prefix + s.charAt(i);
            }
 
            // System.out.println(prefix);
 
            if(prefix.equals(word))
            {
                return true;
            }
         }
           }
          
        return false;
    }
}

class ImplementTrieDemo
{
    public static void main(String[] args) {
        ImplementTrie it = new ImplementTrie();
        it.insert("sagar");
        it.insert("apple");
        it.insert("mango");
        it.insert("tango");
        // System.out.println(it.list);
        it.insert("app");
        // System.out.println(it.startsWith("app")); 
        System.out.println(it.search("ap"));


    }
}