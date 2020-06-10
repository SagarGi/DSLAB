public class Insertion {
    public void insertionElementInHeap(int array[], int length , int val)
    {
        array[length - 1] = val;
        int childIndex = length - 1;
        while(childIndex > 0)
        {
            int parentIndex = (int)Math.floor(childIndex / 2);
            if(array[parentIndex] < array[childIndex])
            {
                // swap 
                int temp = array[parentIndex];
                array[parentIndex] = array[childIndex];
                array[childIndex] = temp;
            }
            else
            {
                return;
            }
            childIndex = parentIndex;
        }
    
    }

    public void deletionElementInHeap(int array[])
    {
        
        // we swap root element and the last element of the max heap
        int length = array.length;
        array[0] = array[length - 1];
        array[length - 1] = 0; // replace last element with zero


        length = length - 1;
        System.out.println(length);
       int parentIndex = 0;
      int k = 3;
       while(k > 0){
        int leftChildIndex = 2  * parentIndex + 1;
        int rightChildIndex = 2  * parentIndex + 2;

        if(leftChildIndex < length && array[leftChildIndex] > array[rightChildIndex])
        {
             //    swap with left
             int temp1 = array[parentIndex];
             array[parentIndex] = array[leftChildIndex];
             array[leftChildIndex] = temp1;
 
             parentIndex = leftChildIndex;
        }
        else if(rightChildIndex < length && array[rightChildIndex] > array[leftChildIndex])
        {
            //    swap with left
         int temp1 = array[parentIndex];
         array[parentIndex] = array[rightChildIndex];
         array[rightChildIndex] = temp1;

         parentIndex = rightChildIndex;
        }
        k--;
        System.out.println(parentIndex);
    }
       
    

    }

    public void displayHeap(int array[])
    {   
        for(Integer i : array)
        {
            System.out.print(i + "  ");
        }
    }
}

class InsertionDemo
{
    public static void main(String[] args) {
        int length = 10;
        int array[] = new int[length];
        array[0] = 70;
        array[1] = 50;
        array[2] = 45;
        array[3] = 60;
        array[4] = 39;
        array[5] = 16;
        array[6] = 10;
        array[7] = 9;
        array[8] = 35;
        int val = 60;
        Insertion i = new Insertion();
        // i.insertionElementInHeap(array, length, val);
        // i.displayHeap(array);

        int array1[] = new int[]{50,45,35,33,16,25,34,12,10};
        i.deletionElementInHeap(array1);
        i.displayHeap(array1);

        



    }
}