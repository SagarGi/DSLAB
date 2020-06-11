import java.util.PriorityQueue;

public class KthLargestInStream {
    PriorityQueue<Integer> minHeap;
    int k;
    public KthLargestInStream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for(Integer i : nums)
        {
            minHeap.add(i);
            if(minHeap.size() > k)
            {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        // use min heap
        minHeap.add(val);
        if(minHeap.size() > k)
        {
           minHeap.poll();
        }

        return minHeap.peek();
    }
}

class KthLargestInStreamDemo
{
    public static void main(String[] args) {
        int nums[] = {4,5,8,2};
        int k = 3;
        KthLargestInStream ke = new KthLargestInStream(k, nums);
        System.out.println(ke.add(3));
        System.out.println(ke.add(5));
        System.out.println(ke.add(10));
        System.out.println(ke.add(9));
        System.out.println(ke.add(4));



    }
}