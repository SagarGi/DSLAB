import java.util.ArrayList;
import java.util.List;

public class LenthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0)
        {
            return 0;
        }
        String wordsArray[] = s.split(" ");
        if(wordsArray.length == 0)
        {
            return 0;
        }
        
        return wordsArray[wordsArray.length - 1].length();
        
    }
}


class LengthOfLastWordDemo
{
    public static void main(String[] args) {
        String s = " ";
        LenthOfLastWord lw = new LenthOfLastWord();
        System.out.println(lw.lengthOfLastWord(s));
    }
}