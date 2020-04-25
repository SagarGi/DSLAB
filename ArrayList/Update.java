import java.util.ArrayList;
public class Update {

    public static void main(String args[])
    {
        ArrayList<String> color = new ArrayList<String>();
        color.add("blue");
        color.add("blue");
        color.add("yellow");
        color.add("pink");

        color.set(0, "red");
        System.out.println(color);

        // set and add can also be used

    
    }

}