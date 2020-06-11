import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
       for(int i = 0; i < nums.length; i++)
       {
           minHeap.add(nums[i]);
           if(minHeap.size() > k)
           {
               minHeap.poll();
           }
       }

       return minHeap.poll();
    }
}

class KthLargestElementDemo
{
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        KthLargestElement ke  = new KthLargestElement();
        System.out.println(ke.findKthLargest(nums, k));
    }
}