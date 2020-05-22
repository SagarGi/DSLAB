import java.util.ArrayList;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {

        int ans = -1;

        if(s.length() == 0)
        {
            return ans;
        }

        if(s.length() == 1)
        {
            return 0;
        }

        ArrayList<Character> al = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++)
        {
            int count = 0;
            if(!al.contains(s.charAt(i)))
            {
                al.add(s.charAt(i));
                for(int j = i; j < s.length(); j++)
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        count++;
                    }
                }
            }
            else
            {
                continue;
            }
            // System.out.println(count);
            if(count == 1)
            {
                ans = i;
                break;
            }
        }

        return ans;
        
    }
    
}

class FirstUniqueCharacterDemo
{
    public static void main(String args[])
    {
        String s = "e";
        FirstUniqueCharacter fc = new FirstUniqueCharacter();
        System.out.println(fc.firstUniqChar(s));

    }
}