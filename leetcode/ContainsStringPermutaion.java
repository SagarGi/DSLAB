import java.util.Arrays;

public class ContainsStringPermutaion {
    public boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();

        int s1freq[] = new int[26];
        int s2freq[] = new int[26];

        if(s1Length < s2Length)
        {
            return false;
        }

        for(int i = 0; i < s2Length; i++)
        {
            s1freq[s1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s2Length; i++)
        {
            s2freq[s2.charAt(i) - 'a']++;
        }

        for(int i = s2Length; i < s1Length; i++)
        {
            if(Arrays.equals(s1freq, s2freq))
            {
                return true;
            }
            s1freq[s1.charAt(i) - 'a']++;
            s1freq[s1.charAt(i - s2Length) - 'a']--;

        }

        // for the last loop
        if(Arrays.equals(s1freq, s2freq))
        {
            return true;
        }

        return false;
    }
}

class ContainsStringPermutaionDemo
{
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        ContainsStringPermutaion csp = new ContainsStringPermutaion();
        System.out.println(csp.checkInclusion(s1, s2));
    }
}

