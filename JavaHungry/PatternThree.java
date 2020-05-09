import java.util.ArrayList;
import java.util.List;

public class PatternThree {

    public static void main(String[] args) {
        String s = "Hello Beautiful Sentence in a frame";
        String [] str = s.split(" ");
        List<String> list = new ArrayList<>();
        for(String st : str)
        {
            list.add(st);
        }
        BreakListFunciton bf = new BreakListFunciton();
        List<String> mainlist = bf.breakList(list);
        System.out.println(mainlist);

        int length = bf.returnLongestLength(list);

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