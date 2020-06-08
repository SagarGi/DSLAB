import java.util.HashMap;

public class ExceelSheetOpposite {
    public int titleToNumber(String s) {

        int res = 0;
        for (int i=0;i<s.length();i++)
        res=res*26+(s.charAt(i)-'A'+1);
        return res;
    }
}

class ExceelSheetOppositeDemo
{
    public static void main(String[] args) {
        ExceelSheetOpposite eo = new ExceelSheetOpposite();
        String s = "AAB";
        System.out.println(eo.titleToNumber(s));
    }
}