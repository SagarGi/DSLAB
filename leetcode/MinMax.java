// without using DAC method

public class MinMax
{
    int array[] = {10,20,30,40};
    int max;
    int min;
    public int getMax()
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            if(array[0] < array[i+1])
            {
                int temp;
                temp = array[0];
                array[0] = array[i+1];
                array[i+1] = temp;
            }
        }
        max = array[0];
        return max;
    }

    public int getMin()
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            if(array[0] > array[i+1])
            {
                int temp;
                temp = array[0];
                array[0] = array[i+1];
                array[i+1] = temp;
            }
        }
        min = array[0];
        return min;
    }
  
}
class MinMaxDemo
{
    public static void main(String[] args)
    {
        MinMax mm = new MinMax();
        System.out.println("Max = "+ mm.getMax()); 
        System.out.println("Min = " + mm.getMin()); 
       
    }
}