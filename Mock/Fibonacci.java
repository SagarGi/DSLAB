public class Fibonacci {
    public int fib(int N) {
        int dp[] = new int[N];
        if(N == 0)
        {
            return 0;
        }
        if(N <= 2)
        {
            return 1;
        }
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < N; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[N-1];
    }
}


class FibonacciDemo
{
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int N = 0;
        System.out.println(f.fib(N));
    }
}