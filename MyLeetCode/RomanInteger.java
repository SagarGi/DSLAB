import java.util.HashMap;

public class RomanInteger {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        if(s.length() == 0)
        {
            
        }
        if(s.length() == 1)
        {
            result = map.get(s.charAt(0));
        }

        if(s.length() > 1 )
        {
            for(int i = 0; i < s.length(); i++)
            {
                if(i != s.length() - 1)
                {
                    if(map.get(s.charAt(i)) >= map.get(s.charAt( i + 1)))
                    {
                        result = result + map.get(s.charAt(i));
                    }
                    else
                    {
                        result = result + (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
                        i = i + 1;
                    }
                }
                else
                {
                    result = result + map.get(s.charAt(i));
                }
            }
        }
       

        return result;
        
    }
    
}

class RomanIntegerDemo
{
    public static void  main(String args[])
    {
        String s = "";
        RomanInteger ri = new RomanInteger();
        System.out.println(ri.romanToInt(s));
    }
}

// it works
