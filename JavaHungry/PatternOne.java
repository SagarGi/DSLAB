import java.util.ArrayList;
import java.util.List;

public class PatternOne {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("in");
        list.add("a");
        list.add("frame");
        list.add("sagar");
        for(int i = 0; i < list.size() + 2; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(i == 0 || i == list.size() + 2 - 1)
                {
                    System.out.print("+");
                }
                else
                {
                    if(j == 0 || j == 9 - 1)
                    {
                        System.out.print("+");
                    }
                    else if(j == 1 || j == 9 - 2)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        try {

                            System.out.print(list.get(i-1).charAt(j-2));
                            
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