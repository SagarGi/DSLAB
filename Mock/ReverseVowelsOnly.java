import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOnly {
    public String reverseVowels(String s) {
        String result = "";
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');

        char ch[] = s.toCharArray();

        for(int i = 0; i < s.length(); i++)
        {
            if(list.contains(ch[i]) && i < s.length() - 1)
            {
                for(int j = i + 1; j < s.length(); j++)
                {
                    if(list.contains(ch[j]))
                    {
                        // swap
                        char temp = ch[i];
                        ch[i] = ch[j];
                        ch[j] = temp;
                    }
                }
            }
        }

        for(char c : ch)
        {
            result = result + c;
        }

        return result;

    }
}


class ReverseVowelsOnlyDemo
{
    public static void main(String[] args) {
        String s = "a";
        ReverseVowelsOnly rvo = new ReverseVowelsOnly();
        System.out.println(rvo.reverseVowels(s));
    }
}