import java.util.ArrayList;

public class ReverseVowelofString {

    public String reverseVowels(String s) {

        ArrayList<Character> list = new ArrayList<Character>(5);
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
        for(int i = 0; i < s.length() - 1; i++)
        {
                if(list.contains(s.charAt(i)))
                {
                    for(int j = i + 1; j < s.length(); j++)
                    {
                        if(list.contains(s.charAt(j)))
                        {
                            char ch[] = s.toCharArray(); 
                            char temp = ch[i]; 
                            ch[i] = ch[j]; 
                            ch[j] = temp; 
                            s = new String(ch);
                        }
                    }
                }
            
        }
        return s;
        
    }
    
}

class ReverseVowelofStringDemo
{
    public static void main(String args[])
    {
        String s = "aA";
        ReverseVowelofString rs = new ReverseVowelofString();
        System.out.println(rs.reverseVowels(s));
    }
}

// time limit exceeded
