import java.util.*;
public class Compare {

    public static void main(String args[])
    {
        ArrayList<String> color = new ArrayList<String>();
        color.add("yellow");
        color.add("pink");
        color.add("orange");

        ArrayList<String> color1 = new ArrayList<String>();
        color1.add("yellow");
        color1.add("pink");
        color1.add("green");
        color1.add("orange");
        ArrayList<String> color2 = new ArrayList<String>();

        for(String e : color)
        {
            if(color1.contains(e))
            {
                color2.add("yes");
            }
            else
            {
                color2.add("No");
            }
        }

        System.out.println(color2);


    }

}