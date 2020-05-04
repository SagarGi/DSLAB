import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatedWord
{
    public ArrayList<String> getRepeatedWprd(String sentence)
    {
        ArrayList<String> list = new ArrayList<String>();

        String [] words = sentence.split(" ");
        HashMap<String , Integer> map = new HashMap<String, Integer>();
        
        for(String s : words)
        {
            if(!map.containsKey(s))
            {
                map.put(s, 1);
            }
            else
            {
                map.put(s, map.get(s) + 1);
            }
        }
        System.out.println(map);

       for(String s : map.keySet())
       {
           if(map.get(s) > 1)
           {
               list.add(s);
           }
       }

        return list;
    }
}
class RepeatedWordDemo
{
    
    public static void main(String args[])
    {
        String sentence = "i love love java java very very much";
        RepeatedWord r = new RepeatedWord();
        System.out.println(r.getRepeatedWprd(sentence));
    }
}