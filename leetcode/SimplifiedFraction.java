import java.util.ArrayList;
import java.util.List;

public class SimplifiedFraction {
   
    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i < n; i++)
        {
            for(int j = i + 1; j <= n; j++)
            {
                    
                    list.add(i + "/" + j);
            }

        }

        System.out.println();

       
        return list;
    }
}

class SimplifiedFractionDemo
{
    public static void main(String[] args) {
        int n = 8;
        SimplifiedFraction sf = new SimplifiedFraction();
        System.out.println(sf.simplifiedFractions(n));
    }
}
//  not completed