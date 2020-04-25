import java.util.ArrayList;
import java.util.Collections;

public class Remaining {

    public static void main(String args[])
    {
        // Swap------
        ArrayList<String> color = new ArrayList<String>(10);
        color.add("blue");
        color.add("green");
        color.add("yellow");
        color.add("pink");

        Collections.swap(color, 0, 2);
        // System.out.println(color);

        // jointwo arraylist-------------
        ArrayList<String> color1 = new ArrayList<String>();
        color.add("black");
        color.add("white");
        color.add("purple");
        color.add("deeppink");

        ArrayList<String> color2 = new ArrayList<String>();
        color2.addAll(color);
        color2.addAll(color1);
        // System.out.println(color2);

        // clone---------
        ArrayList<String> color3 = (ArrayList<String>)color2.clone();
        // System.out.println(color3);

        // remove ----------------------
        color.remove(0); // and aslo removeAll()
        // System.out.println(color);

        // System.out.println(color.isEmpty());

        
        System.out.println(color.size());
        color.trimToSize();

        System.out.println(color.size());

        color.ensureCapacity(20);


    }

}