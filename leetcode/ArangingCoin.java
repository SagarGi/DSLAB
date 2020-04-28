
public class ArangingCoin {

    public int arrangeCoins(int n)
    {
        int answer = 0;
        int iterator = 1;
        while(n >= 0)
        {
            int tempAnswer;
            tempAnswer = n - iterator;
            if(tempAnswer <= 0)
            {
                answer = iterator -1;
                break;
            }
            n = tempAnswer;
            iterator++;
        }
        return answer;
    }

}

class arrangeCoinsDemo
{
    public static void main(String args[])
    {
        int n = 10;
        ArangingCoin ac = new ArangingCoin();
        System.out.println(ac.arrangeCoins(n));
    }
}