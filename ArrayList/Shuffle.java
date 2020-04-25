import java.util.ArrayList;
import java.util.Collections;
public class Shuffle {

    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<String>();
        color.add("yellow");
        color.add("pink");
        color.add("green");
        color.add("violet");
        Collections.shuffle(color);
        System.out.println(color);
    }

}