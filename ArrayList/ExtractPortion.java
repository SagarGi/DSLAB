import java.util.*;
public class ExtractPortion {

    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<String>();
        color.add("yellow");
        color.add("pink");
        color.add("green");
        color.add("violet");
        color.add("orange");
        System.out.println(color);

        List<String> subColor = color.subList(0, 3);
        System.out.println(subColor);


       
    }


}