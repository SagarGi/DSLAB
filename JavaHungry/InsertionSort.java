public class InsertionSort {

    public static void main(String[] args) {
        int [] array = {7,8,5,2,4,6,3};
        for(int i = 0; i < array.length; i++)
        {
            int j = i;
            while(j > 0 && array[j] < array[j-1])
            {
                int temp;
                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    
}