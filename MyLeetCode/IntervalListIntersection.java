import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersection {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> l = new ArrayList<>();

        // two pointer method

        int i = 0; // for A
        int j = 0; // for B

        while(i < A.length && j < B.length)
        {
            
            int max = Math.max(A[i][0], B[j][0]);
            int min =  Math.min(A[i][1], B[j][1]);

            if(max <= min)
            {
                l.add(new int[]{max, min});
            }

            if(A[i][1] < B[j][1])
            {
                i++;
            }
           else
           {
               j++;
           }
        }
        int ans[][] = new int[l.size()][2];

        int a = 0;
        for(int array[] : l)
        {
            ans[a] = array;
            a++;
        }
        return ans;
    }
}

class IntervalListIntersectionDemo
{
    public static void main(String[] args) {
        int [][] A = {{0,2},{5,10},{13,23},{24,25}};
        int [][] B = {{1,5},{8,12},{15,24},{25,26}};
        IntervalListIntersection i = new IntervalListIntersection();
        int [][]ans = i.intervalIntersection(A, B);

        for(int m = 0; m < ans.length; m++)
        {
            for(int n = 0; n < 2; n++)
            {
                System.out.print(ans[m][n]);
            }

            System.out.println();
        }
    }
}