import java.util.ArrayList;
import java.util.List;

public class SimplifiedFraction {

    public int gcd(int i , int j)
    {
        if(j == 0)
        {
            return i;
        }

        return gcd(j, i % j);
    }
   
    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i < n; i++)
        {
            for(int j = i + 1; j <= n; j++)
            {
                    if(gcd(i, j) == 1)
                    {
                        list.add(i + "/" + j);

                    }
            }
        }
        // System.out.println(gcd(1, 7));

       
        return list;
    }
}

class SimplifiedFractionDemo
{
    public static void main(String[] args) {
        int n = 10;
        SimplifiedFraction sf = new SimplifiedFraction();
        System.out.println(sf.simplifiedFractions(n));
    }
}
//  not completed
// completed now