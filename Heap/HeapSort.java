public class HeapSort
{
    public void heapify(int array[], int n , int i)
    {
        // makes the given array max heap
        int largest = i;
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;

        while(leftChildIndex < n && array[leftChildIndex] > array[largest])
        {
            largest = leftChildIndex;
        }

        while(rightChildIndex < n && array[rightChildIndex] > array[largest])
        {
            largest = rightChildIndex;
        }

        if(largest != i)
        {
            //swap
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, n, largest);
        }
        
       
    }

    public void printArray(int array[])
    {
        for(Integer i : array)
        {
            System.out.print(i + " ");
        }
    }
}

class HeapSortDemo
{
    public static void main(String[] args) {
        int array[] = {12, 11, 13, 5, 6, 7};
        int n = array.length;
        HeapSort hs = new HeapSort();
        // biuild max heap
        for (int i = n / 2 - 1; i >= 0; i--) 
        
            hs. heapify(array, n, i);
        

        // next is deleting
        for(int i = n - 1; i > 0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            hs.heapify(array, i, 0);
        }

        hs.printArray(array);

    }
}