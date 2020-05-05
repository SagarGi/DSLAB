public class QuickPartition
{
    public int [] quickPartition(int [] array)
    {
        int start = 0;
        int end = array.length - 1;
        int pivot = 0;
        while(start < end)
        {
           while(array[start] <= array[pivot])
           {
               start++;
           }
           while(array[end] >= array[pivot])
           {
               end--;
           }
           //swapping can be done here
           if(start < end)
           {
            int temp;
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
           }
          
        //    System.out.println("Start =" +start);
        //    System.out.println("End =" + end);
        }
       
       
        // System.out.println(start);
        // System.out.println(end);
        // swap the j with the pivot and the pivot is the quick element in the sorting process
        int temp;
        temp = array[pivot];
        array[pivot] = array[end];
        array[end] = temp;

        return array;
       
    }
}
class QuickPartitionDemo
{
    public static void main(String args[])
    {
        int [] array = {10,16,8,12,15,6,3,9,5,50};
        QuickPartition qp = new QuickPartition();
        int [] result = qp.quickPartition(array);
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }

    }
}