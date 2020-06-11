import java.util.Collections;
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

    public int findKthSmallest(int nums[], int k)
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer i : nums)
        {
            maxHeap.add(i);
            if(maxHeap.size() > k)
            {
                maxHeap.poll();
            }
        }

        return maxHeap.poll();
    }
}

class KthLargestElementDemo
{
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        KthLargestElement ke  = new KthLargestElement();
        System.out.println(ke.findKthLargest(nums, k));
        System.out.println(ke.findKthSmallest(nums, k));
    }
}