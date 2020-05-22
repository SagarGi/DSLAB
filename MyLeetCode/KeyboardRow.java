import java.util.ArrayList;
import java.util.Arrays;
public class KeyboardRow {

    public String [] findWords(String[] words) {
       ArrayList<String> a = new ArrayList<String>();
       ArrayList<Character> top = new ArrayList<Character>(Arrays.asList('q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'));
       ArrayList<Character> middle = new ArrayList<Character>(Arrays.asList('a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'));
       ArrayList<Character> bottom = new ArrayList<Character>(Arrays.asList('z','x','c','v','b','n','m','Z','X','C','V','B','N','M'));
       for(String s : words)
       {

        boolean topRow = true;
        boolean middleRow = true;
        boolean bottomRow = true;

        for(char c : s.toCharArray())
        {
            if(!middle.contains(c))
            {
                middleRow = false;
            }
            if(!top.contains(c))
            {
                topRow = false;
            }
            if(!bottom.contains(c))
            {
                bottomRow = false;
            }
        } 
        if(middleRow || topRow || bottomRow)
        {
            a.add(s);
        }       
       }
       String result[] = new String[a.size()];
       for(int i = 0; i < result.length; i++)
       {
            result[i] = a.get(i);
       }

       return result;
    }
    
}

class KeyboardRowDemo
{
    public static void main(String args[])
    {
        String words[] = {"Hello", "Alaska", "Dad", "Peace"};
        KeyboardRow key = new KeyboardRow();
        String[] result = key.findWords(words);
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
}