import java.util.ArrayList;

public class SearchItem {

    public boolean searchItem(ArrayList<String> color, String item)
    {
        boolean result = false;
        for(int i = 0; i < color.size(); i++)
        {
            if(color.get(i) == item)
            {
                result = true;
            }
        }
        return result;
    }

   public static void main(String[] args) {
    
    SearchItem si = new SearchItem();

    ArrayList<String> color = new ArrayList<String>();
    color.add("yellow");
    color.add("pink");
    color.add("green");
    color.add("violet");
    String item = "yello";
    boolean result = si.searchItem(color, item);
    System.out.println(result);


}

}