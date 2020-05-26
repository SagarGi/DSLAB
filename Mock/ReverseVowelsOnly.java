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
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');

        // solve using two pointer
        int start = 0;
        int end = s.length() - 1;
        char [] ch = s.toCharArray();

        while(start < end)
        {
            if(list.contains(ch[start]) && list.contains(ch[end]))
            {
                char temp = ch[start];
                 ch[start]= ch[end];
                 ch[end]=temp;

                 start++;
                 end--;
            }
            if(!list.contains(ch[start]))
            {
                start++;
            }
            if(!list.contains(ch[end]))
            {
                end--;
            }

        }
        return String.valueOf(ch);

    }
}


class ReverseVowelsOnlyDemo
{
    public static void main(String[] args) {
        String s = "leetcode";
        ReverseVowelsOnly rvo = new ReverseVowelsOnly();
        System.out.println(rvo.reverseVowels(s));
    }
}