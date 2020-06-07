import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionByHeight
{
    public int[][] reconstructQueue(int[][] people) {
        // we sort array accourding to their h and k

        // we use comparator

        Arrays.sort(people, new Comparator<int []>() {

            public int compare(int a[] , int []b)
            {
                if(b[0] == a[0])
                {
                    return a[1] - b[1];
                }
                else
                {
                    return b[0] - a[0];
                }
            }
        });

        List<int[]> result = new ArrayList<>();

        for(int[] p : people)
        {
            result.add(p[1], p);
        }
        int n = people.length;
        System.out.println(result);
        return result.toArray(new int[n][2]);
    }
}

class QueueReconstructionByheightDemo
{
    public static void main(String[] args) {
        QueueReconstructionByHeight q = new QueueReconstructionByHeight();
        int people[][] = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int result[][] = q.reconstructQueue(people);
        
    }
}