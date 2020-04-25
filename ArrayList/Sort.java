import java.util.ArrayList;
import java.util.Collections;
public class Sort {
    public static void main(String[] args) {
    
       
        ArrayList<String> color = new ArrayList<String>();
        color.add("yellow");
        color.add("pink");
        color.add("green");
        color.add("violet");

        Collections.sort(color);
        System.out.println(color);

        ArrayList<Integer> color1 = new ArrayList<Integer>();
        color1.add(20);
        color1.add(90);
        color1.add(10);
        color1.add(50);
        color1.add(30);
        Collections.sort(color1);
        System.out.println(color1);


    
    
    }

}