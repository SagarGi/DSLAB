public class UncrossedLine
{
    public int maxUncrossedLines(int[] A, int[] B) {

        

        int aLength = A.length;
        int bLength = B.length;

        if(aLength == 0 || bLength == 0)
        {
            return 0;
        }
        int dp[][] = new int[aLength + 1][bLength + 1];

        for(int i = 0; i < aLength; i++)
        {
            for(int j = 0; j < bLength; j++)
            {
                if(A[i] == B[j])
                {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }
                else
                {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        return dp[aLength][bLength];
    }
}

class UncrossedLineDemo
{
    public static void main(String[] args) {
        int A[] = {1,3,7,1,7,5};
        int B [] = {1,9,2,5,1};

        UncrossedLine ul = new UncrossedLine();
        System.out.println(ul.maxUncrossedLines(A, B));
    }
}


// can be done using dynamic programming;