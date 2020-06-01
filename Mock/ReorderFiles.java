import java.util.ArrayList;
import java.util.List;

public class ReorderFiles {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitsLogs = new ArrayList<>();

        if(logs.length ==  0)
        {
            return new String []{};
        }
       

        for(int i = 0; i < logs.length; i++)
        {
            String s[] = logs[i].split(" ");
            boolean isChar = Character.isDigit(s[1].charAt(0));
            if(isChar)
            {
                digitsLogs.add(logs[i]);
            }
            else
            {
                letterLogs.add(logs[i]);
            }
           
        }
        String [] result = new String[logs.length];
        int i = 0;
        for(String s : letterLogs)
        {
            result[i] = s;
            i++;
        }

        for(String d : digitsLogs)
        {
            result[i] = d;
            i++;
        }

        return result;
    }
}

class ReorderFilesDemo
{
    public static void main(String[] args) {
        ReorderFiles rf = new ReorderFiles();
        String [] logs = {"dig1 8 1 5 1"};
        String result[] = rf.reorderLogFiles(logs);
        for(String s : result)
        {
            System.out.println(s + " ");
        }
    }
}

// not lexiordically order.
// comparator is not used