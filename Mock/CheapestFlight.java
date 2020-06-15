import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class CheapestFlight
{
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        HashMap<Integer, List<int[]>> map = new HashMap<>();

        // put the value in  the map as the adjacency representation of map

        for(int[] f: flights)
        {
            map.putIfAbsent(f[0], new ArrayList<>());
            map.get(f[0]).add(new int[]{f[1],f[2]});
        }

        // make a minheap snince we have to sort it accourding to the cost of light 

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int [] b)
            {
                return Integer.compare(a[1], b[1]);
            }
        });

        // put the initial value to the minheap

        minHeap.offer(new int[]{src,0,K});

        // apply bfs

        while(!minHeap.isEmpty())
        {
            int [] array = minHeap.poll();
            int current = array[0];
            int cost = array[1];
            int stop = array[2];
            if(current == dst)
            {
                return cost;
            }
            if(stop >= 0)
            {
                // if there is no way to go to the destination
                if(!map.containsKey(current))
                {
                    continue;
                }
                // else keep on adding the adjacents

                for(int[] next : map.get(current))
                {   
                    minHeap.add(new int[]{next[0], cost + next[1], stop - 1});
                }
            }
        }
        return -1;
    }
}

class CheapestFlightDemo
{
    public static void main(String[] args) {
        int n = 3;
        int flights[][] = {{0,1,100},{1,2,100},{0,2,500}};
        int src = 0;
        int dst = 2;
        int K = 1;
        CheapestFlight cf = new CheapestFlight();
        System.out.println(cf.findCheapestPrice(n, flights, src, dst, K));
    }
}
