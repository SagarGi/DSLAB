
public class ClimbingStairs {
    int a = 1;
    int b = 1;
    int c;

    public int climbStairs(int n)
    {
        int result = 0;
        // practically it travels in (2,3,5,8,13 ...) which is fibonacci series so fibonacci series can be used for finding the no of steps
        if(n == 1)
        {
            result = a;
        }
      
        else if(n > 1)
        {
            for(int i = 0; i < n-1; i++)
            {
                c = a + b;
                a = b;
                b = c;
            }
            result = c;
        }
        return result;
    }

}

class ClimbingStairsDemo
{
    public static void main(String args[])
    {
        int n = 6;
        ClimbingStairs cs = new ClimbingStairs();
        int result = cs.climbStairs(n);
        System.out.println(result);
    }
}

// this may not be the code to the answer.
// this is only my opinion to code.