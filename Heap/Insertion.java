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
        i.insertionElementInHeap(array, length, val);
        i.displayHeap(array);

    }
}