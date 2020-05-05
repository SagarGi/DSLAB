import java.util.ArrayList;

public class UniqueChar {

    public boolean hasUniqueCharacter(String s)
    {
        boolean ans = true;
        char ch[] = s.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for(char i : ch)
        {
            if(!arrayList.contains(i))
            {
                arrayList.add(i);
            }
            else
            {
                ans = false;
            }
        }
        return ans;
    }
    
}

class UniqueCharDemo
{
    public static void main(String args[])
    {
        String s = "sarg";
        UniqueChar uc = new UniqueChar();
        System.out.println(uc.hasUniqueCharacter(s));
    }
}