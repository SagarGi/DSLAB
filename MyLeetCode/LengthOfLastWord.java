
public class LengthOfLastWord {

    public int lenghtOfLastWord(String s)
    {
        int length = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                length = 0;
            }
            else
            {
                length++;
            }
        }
        return length;
    }

}

class LengthOfLastWordDemo
{
    public static void main(String args[])
    {
        LengthOfLastWord lw = new LengthOfLastWord();
        String s = "Hello sagargurung grg";
        int result = lw.lenghtOfLastWord(s);
        System.out.println("The Length of last word is = " + result);
    }
}