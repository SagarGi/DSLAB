import java.util.ArrayList;
import java.util.Collections;
public class Copy {

    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<String>();
        color.add("yellow");
        color.add("pink");
        color.add("green");
        color.add("violet");

        // color is the arraylist 
        ArrayList<String> color1 = new ArrayList<String>(4);
        color1.add("");
        color1.add("");
        color1.add("");
        color1.add("");
       Collections.copy(color1, color);
       System.out.println(color1);

    }
}