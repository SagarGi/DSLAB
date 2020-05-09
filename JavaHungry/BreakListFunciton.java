import java.util.ArrayList;
import java.util.List;

public class BreakListFunciton {

    public int returnLongestLength(List<String> list)
    {
        int length = Integer.MIN_VALUE;
        for(String s : list)
        {
            if(s.length() > length)
            {
                length = s.length();
            }
        }

        return length;
    }

    public List<String> breakList(List<String> list)
    {
        List<String> l = new ArrayList<>();

       int length = returnLongestLength(list);

        for(int i = 0; i < list.size(); i++)
           {
               String s = list.get(i);
               while(s.length() <= length)
               {
                   if(i < list.size() - 1 && s.length() + list.get(i + 1).length() + 1 <= length)
                   {
                     s = s + " " + list.get(i + 1);
                     i++;
                   }
                   else
                   {
                       break;
                   }
               }
               l.add(s);
           }
        return l;
    }
    
}