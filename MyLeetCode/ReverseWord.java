
public class ReverseWord {

    public String reverseWords(String s) {
        String ans = "";
        String trimmedString = s.trim();
        String splitString[] = trimmedString.split(" +");

        for(int i = splitString.length-1; i >= 0; i--)
        {
            if(i == 0)
            {
                ans = ans + splitString[i];
            }
            else
            {
                ans = ans + splitString[i] + " ";
            }
           
        }
        return ans;
    }

}

class ReverseWordDemo
{
    public static void main(String args[])
    {
        String s = "  world hello  ";
        ReverseWord rw = new ReverseWord();
        System.out.println(rw.reverseWords(s));
    }
}