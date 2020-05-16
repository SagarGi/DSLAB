
public class ConsecutiveCharacters
{
    public int maxPower(String s) {
        // lets do it by using run length encoding
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int currentCount = 1;
            while(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1))
            {
                currentCount++;
                i++;
            }

            if(currentCount > count)
            {
                count = currentCount;
            }
        }

        return count;
    }
}

class ConsecutiveCharactersDemo
{
    public static void main(String[] args) {

        String s = "sagar";
        ConsecutiveCharacters cc = new ConsecutiveCharacters();
        System.out.println(cc.maxPower(s));
        
    }
}