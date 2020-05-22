import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String str) {

       String splitString [] = str.split(" ");
       if(pattern.length() != splitString.length)
       {
          return false;
       }

       HashMap<Character , String> hm = new HashMap <Character, String>();
       for(int i = 0; i < pattern.length(); i++)
       {
           char firstChar = pattern.charAt(i);
           if(hm.containsKey(firstChar))
           {
                if(!hm.get(firstChar).equals(splitString[i]))
                {
                   return false;
                }
           }
           else
           {
                if(hm.containsValue(splitString[i]))
                {
                    return false;
                }
               hm.put(firstChar, splitString[i]);
           }
       }

       return true;
        
    }

}

class WordPatternDemo
{
    public static void main(String args[])
    {
        String pattern = "abba";
        String str = "dog cat cat dog";
        WordPattern wp = new WordPattern();
        System.out.println(wp.wordPattern(pattern, str)); 
    }

}