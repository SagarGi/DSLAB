import java.util.Scanner;

public class RandomAlgorithm {

    public boolean checkOdd(int number)
    {
        boolean result = false;

        if(number%2 != 0)
        {
            result = true;
        }
        return result;
    }

    public void randomAlgorithm(int userEnter)
    {
        if(checkOdd(userEnter))
        {
            System.out.println("odd");
            int numberOdd = userEnter * 3;
            for(int i = 0; i < ((userEnter * 2) + 2); i++)
            {
                System.out.print(numberOdd + "\t");
                numberOdd = numberOdd + 2;
            }
        }
        else
        {
            System.out.println("Even");
            int numberEven = userEnter * 3;
            for(int i = 0; i < ((userEnter * 2) + 2); i++)
            {
                System.out.print(numberEven + "\t");
                numberEven = numberEven + 2;
            }
        }
    }
}

class RandomAlgorithmDemo
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int userEnter = scanner.nextInt();
        RandomAlgorithm ra = new RandomAlgorithm();
        ra.randomAlgorithm(userEnter);

    }
}