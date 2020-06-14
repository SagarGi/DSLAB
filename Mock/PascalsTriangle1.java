import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle1
{
    public List<List<Integer>> generate1(int numRows) {
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

    public List<Integer> generate2(int rowIndex) {
        // solving by dynamic programming

        int dp[][] = new int[rowIndex + 1][rowIndex + 1];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++)
        {
           
            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == rowIndex)
                {
                    dp[i][j] = 1;
                }
                else
                {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        for(int i = rowIndex; i <= rowIndex; i++)
        {
            for(int j = 0; j < dp[rowIndex].length; j++)
            {
                list.add(dp[i][j]);
            }
        }
        return list;
    }
}

class PascalsTriangle1Demo
{
    public static void main(String[] args) {
        int numRows = 0;
        PascalsTriangle1 pt = new PascalsTriangle1();
        List<List<Integer>> res = pt.generate1(numRows);
        // System.out.println(res);
        List<Integer> result = pt.generate2(4);
        System.out.println(result);
    }
}