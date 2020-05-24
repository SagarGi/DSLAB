import java.util.ArrayList;
import java.util.List;

public class MaxNumberVowels {
    public int maxVowels(String s, int k) {
        List<Character> l = new ArrayList<>();
        l.add('a');
        l.add('e');
        l.add('i');
        l.add('o');
        l.add('u');
        int max = 0;
        for(int i = 0; i < s.length() - k + 1; i++)
        {
            
                int tempMax = 0;
                int j = i;
                int tempLength = k;
                while(tempLength > 0)
                {
                    if(l.contains(s.charAt(j)))
                    {
                        tempMax++;
                    }
                    j++;
                   tempLength--;
                }
                if(tempMax > max)
                {
                    max = tempMax;
                }
        }
        return max;
    }
}

class MaxNumberVowelsDemo
{
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        MaxNumberVowels m = new MaxNumberVowels();

        System.out.println(m.maxVowels(s, k));
    }
}

// works but time limits exceeds
