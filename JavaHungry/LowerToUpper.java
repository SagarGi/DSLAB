import java.util.HashMap;

public class LowerToUpper {

    public String lowerToUpper(String s)
    {
        String result = "";
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('q', 'Q');
        map.put('w', 'W');
        map.put('e', 'E');
        map.put('r', 'R');
        map.put('t', 'T');
        map.put('y', 'Y');
        map.put('u', 'U');
        map.put('i', 'I');
        map.put('o', 'O');
        map.put('p', 'P');
        map.put('a', 'A');
        map.put('s', 'S');
        map.put('d', 'D');
        map.put('f', 'F');
        map.put('g', 'G');
        map.put('h', 'H');
        map.put('j', 'J');
        map.put('k', 'K');
        map.put('l', 'L');
        map.put('z', 'Z');
        map.put('x', 'X');
        map.put('c', 'C');
        map.put('v', 'V');
        map.put('b', 'B');
        map.put('n', 'N');
        map.put('m', 'M');
        
        map.put('Q','q');
        map.put('W','w');
        map.put('E','e');
        map.put('R','r');
        map.put('T','t');
        map.put('Y','y');
        map.put('U','u');
        map.put('I','i');
        map.put('O','o');
        map.put('P','p');
        map.put('A','a');
        map.put('S','s');
        map.put('D','d');
        map.put('F','f');
        map.put('G','g');
        map.put('H','h');
        map.put('J','j');
        map.put('K','k');
        map.put('L','l');
        map.put('Z','z');
        map.put('X','x');
        map.put('C','c');
        map.put('V','v');
        map.put('B','b');
        map.put('N','n');
        map.put('M','m');

        char ch[] = s.toCharArray();
        for(char c : ch)
        {
            result = result + map.get(c);
        }
        return result;
    }
    
}

class LowerToUpperDemo
{
    public static void main(String args[])
    {
        String s= "sagarSAGAR";
        LowerToUpper lp = new LowerToUpper();
        System.out.println(lp.lowerToUpper(s));
    }
}