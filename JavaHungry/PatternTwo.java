import java.util.ArrayList;
import java.util.List;

public class PatternTwo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("beautiful");
        list.add("World");
        list.add("in");
        list.add("a");
        list.add("frame");
        list.add("lambuji");
        
        //lets find the max length of a word
        int length = Integer.MIN_VALUE;
        for(String s : list)
        {
            if(s.length() > length)
            {
                length = s.length();
            }
        }

        int listSize = list.size();

       List<String> mainlist = new ArrayList<>();

           for(int i = 0; i < listSize; i++)
           {
               String s = list.get(i);
               while(s.length() <= length)
               {
                   if(i < listSize - 1 && s.length() + list.get(i + 1).length() + 1 <= length)
                   {
                     s = s + " " + list.get(i + 1);
                     i++;
                   }
                   else
                   {
                       break;
                   }
               }
               mainlist.add(s);
           }

           for(int i = 0; i < mainlist.size() + 2; i++)
        {
            for(int j = 0; j < length + 4; j++)
            {
                if(i == 0 || i == mainlist.size() + 2 - 1)
                {
                    System.out.print("+");
                }
                else
                {
                    if(j == 0 || j == length + 4 - 1)
                    {
                        System.out.print("+");
                    }
                    else if(j == 1 || j == length + 4 - 2)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        try {

                            System.out.print(mainlist.get(i-1).charAt(j-2));
                            
                        } catch (Exception e) {

                            System.out.print(" ");
                           
                        }
                    }
                }
            }
            System.out.println("");
        }
     
    }
    
}