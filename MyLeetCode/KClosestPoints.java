import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPoints {
    public int[][] kClosest(int[][] points, int K) {

        Comparator<int[]> com = (a , b) ->
        {
            if((b[0] * b[0] + b[1] * b[1]) > (a[0] * a[0] + a[1] * a[1]))
            {
                return 1;
            }
            return -1;
        };
       
        PriorityQueue<int[]> heap = new PriorityQueue<>(com);

        for(int[] i : points)
        {
            heap.add(i);
            if(heap.size() > K)
            {
                heap.remove();
            }
        }

        int[][] result = new int[K][2];
        int i = 0;
        while(K > 0)
        {
            
            result[i] = heap.remove();
            K--;
            i++;
        }

        return result;
    }
}

class KClosestPointsDemo
{
    public static void main(String[] args) {
        int K = 2;
        int points [][] = {{1,3},{-2,2}};
        KClosestPoints kp = new KClosestPoints();
        int result[][] =  kp.kClosest(points, K);

        for(int i = 0 ; i < result.length; i++)
        {
            for(int j = 0; j < result[0].length; j++)
            {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}