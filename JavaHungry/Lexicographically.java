import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public  class Lexicographically
{
    Comparator<String> com = new Comparator<String>() {
        public int compare(String a, String b)
        {
            return b.compareTo(a);
        }
    };
    
    public String [] lexicographicallyOrder(String [] s)
    {
       Arrays.sort(s,com);
       return s;
    }
}
class LexicographicallyDemo
{
    public static void main(String[] args) {
        String [] s = {"sagar", "roshan", " binod", "nabin"};
        Lexicographically lg = new Lexicographically();
        String result[] = lg.lexicographicallyOrder(s);

        for(String s1 : result)
        {
            System.out.println(s1);
        }
    }
}