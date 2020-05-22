import java.util.Scanner;
public class MisTyped {

    public boolean isLongPressedName(String name, String typed)
    {
        boolean result = true;
        int k = 0;
        int letterCount = 0;
        int typedSize = typed.length();
        for(int i = 0; i < name.length(); i++)
        {
           if(name.charAt(i) == typed.charAt(k))
           {
             for(int j = k; j < typedSize; j++)
             {
                 if(name.charAt(i) == typed.charAt(j))
                 {
                     letterCount++;
                 }
                 else
                 {
                     break;
                 }
             }
           }
           else
           {
               result = false;
               break;
           }

           k = letterCount;
        }

       return result;
    }

}

class MisTypedDemo
{
    public static void main(String args[])
    {
        MisTyped mt = new MisTyped();
        String name = "saeed";
        String typed;
        Scanner scanner = new Scanner(System.in);
        typed = scanner.nextLine();
        boolean result = mt.isLongPressedName(name, typed);
        System.out.println(result);
        scanner.close();
    }
}

// this code is not 100% true but some how works while mistypeed i.e it doesnt work in condition like name = aleex and typed = aleeex