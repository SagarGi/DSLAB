import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle1
{
    public List<List<Integer>> generate(int numRows) {
        // solving by dynamic programming

        int dp[][] = new int[numRows][numRows];
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i <= numRows - 1; i++)
        {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == numRows - 1)
                {
                    dp[i][j] = 1;
                    list.add(dp[i][j]);
                }
                else
                {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                    list.add(dp[i][j]);
                }
            }

            result.add(list);
        }

        return result;
    }
}

class PascalsTriangle1Demo
{
    public static void main(String[] args) {
        int numRows = 0;
        PascalsTriangle1 pt = new PascalsTriangle1();
        List<List<Integer>> res = pt.generate(numRows);
        System.out.println(res);
    }
}