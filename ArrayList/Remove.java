import java.util.ArrayList;
public class Remove {
    public static void main(String args[])
    {
        ArrayList<String> color = new ArrayList<String>();
        color.add("blue");
        color.add("blue");
        color.add("yellow");
        color.add("pink");

        color.remove(2);
        System.out.println(color);

        
    }


}