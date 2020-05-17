import java.util.HashMap;
import java.util.TreeMap;

public class RearrangeWordInSentence {
    public String arrangeWords(String text) {
        String s = "";
        String mainText = text.toLowerCase();
        String wordString[] = mainText.split(" ");
        int k = wordString.length;

        // bubble sorting
        while(k > 0)
        {
            for(int i = 0; i < k - 1; i++)
            {
               if(wordString[i].length() > wordString[i + 1].length())
               {
                String tmep;
                tmep = wordString[i];
                wordString[i] = wordString[i+1];
                wordString[i+1] = tmep;
               }
            }
            k--;
        }


        for(int i = 0; i < wordString.length; i++)
        {
            if(i == 0)
            {
                s = s + wordString[i].substring(0,1).toUpperCase() + wordString[0].substring(1).toLowerCase() + " ";
            }
            else if(i == wordString.length - 1)
            {
                s = s + wordString[i];
            }
            else
            {
                s = s + wordString[i] + " ";
            }
        }
        return s;
    }
}

class RearrangeWordInSentenceDemo
{
    public static void main(String[] args) {
        String text = "Leetcode";
        RearrangeWordInSentence ras = new RearrangeWordInSentence();
        System.out.println(ras.arrangeWords(text));
    }
}