import java.util.ArrayList;

public class Insert {

    public static void main(String args[])
    {
        ArrayList<String> color = new ArrayList<String>();
        color.add("blue");
        color.add("green");
        color.add("yellow");
        color.add("pink");
        System.out.println(color);

        color.add(0,"deepblue");
         System.out.println(color);

    }

}