import java.util.ArrayList;

public class Iterate {

    public static void main(String args[]) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("blue");
        color.add("green");
        color.add("yellow");
        color.add("pink");

        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
    }

}