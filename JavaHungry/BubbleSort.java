public class BubbleSort {

    public static void main(String args[])
    {
        int array[] = {2,8,5,3,9,4,1,20,100,2};
        int k = array.length;
        while(k >= 0)
        {
            for(int i = 0; i < k - 1; i++)
            {
                if(array[i] > array[i + 1])
                {
                    //swap
                    int tmep;
                    tmep = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmep;
                }
            }
            k--;
        }

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

    }
    
}