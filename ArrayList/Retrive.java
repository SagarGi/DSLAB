import java.util.ArrayList;

public class Retrive {

    public static void main(String args[])
    {
        ArrayList<String> color = new ArrayList<String>();
        color.add("blue");
        color.add("blue");
        color.add("yellow");
        color.add("pink");

        String color1 = color.get(0);
        String color2 = color.get(1);

        boolean result = false;
        if(color1 == color2)
        {
            result = true;
        }

        System.out.println(result);


    }

}