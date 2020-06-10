public class HeapSort
{
    public void heapify(int array[], int n , int i)
    {
        // makes the given array max heap
        int largest = i;
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;

        while(leftChildIndex < array.length && array[leftChildIndex] > array[largest])
        {
            largest = leftChildIndex;
        }

        while(rightChildIndex < array.length && array[rightChildIndex] > array[largest])
        {
            largest = rightChildIndex;
        }

        if(largest != i)
        {
            //swap
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;
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
        int array[] = {15,5,20,1,17,10,30};
        int n = array.length;
        HeapSort hs = new HeapSort();
        for (int i = n / 2 - 1; i >= 0; i--) 
        {
            hs. heapify(array, n, i);
        }
        hs.printArray(array);

    }
}