
public class FindMissing {

    public int findMissing(int array[])
    {
        int result = 0;
        // since the numbers in the array is not repeated so we can just sort array in ascending array
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1; j <array.length; j++)
            {
                if(array[i] > array[j])
                {
                    // we need to swap them
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

        for(int i = 0; i < array.length - 1; i++)
        {
           if(array[i] + 1 != array[i+1])
           {
               result = array[i] + 1;
           }
        } 
        
        return result;

    }

}

class FindMissingDemo
{
    public static void main(String args[])
    {
        // as you know that 8 is missing from the array so we need to return 8 as result in the above function
        int array[] = {1,3};
        FindMissing fm = new FindMissing();
        int result = fm.findMissing(array);
        System.out.println("The Missing Number is : " + result);
       
    }
}