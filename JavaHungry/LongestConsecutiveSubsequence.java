import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public int longestConsecutiveSubsequence(int array[])
    {
        int count = 1;
        Arrays.sort(array);
        for(int i = 0; i < array.length - 1; i++)
        {
            int maxcount = 1;
            while(array[i + 1] == array[i] + 1)
            {
                maxcount++;
                i++;
            }

            if(maxcount > count)
            {
                count = maxcount;
            }
        }
        return count;
    }
}

class LongestConsecutiveSubsequenceDemo
{
    public static void main(String[] args) {
        int array[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
        LongestConsecutiveSubsequence ls = new LongestConsecutiveSubsequence();
        System.out.println(ls.longestConsecutiveSubsequence(array));
    }
}