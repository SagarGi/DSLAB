import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class CheckPrefix {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int ans = -1;
        char[] searchWordChar = searchWord.toCharArray();
        String []sentenceArray = sentence.split(" ");

        for(int i = 0; i < sentenceArray.length; i++)
        {
            char []fString = sentenceArray[i].toCharArray();
            if(fString[0] == searchWordChar[0] && fString.length >= searchWordChar.length)
            {
                boolean tempAns = true;
               for(int j = 1; j < searchWordChar.length; j ++)
               {
                    if(fString[j] != searchWordChar[j])
                    {
                        tempAns = false;
                    }
               }

               if(tempAns == true)
               {
                   return i + 1;
               }
            }

           
        }
        return ans;
    }
}
class CheckPrefixDemo
{
    public static void main(String[] args) {
        CheckPrefix cp = new CheckPrefix();
        String sentence = "i use triple pillow";
        String searchWord = "pillo";
        System.out.println(cp.isPrefixOfWord(sentence, searchWord));
    }
}