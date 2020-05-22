public class SumArray
{
    public int sumArray(int []array , int total)
    {
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == total)
            {
                count++;
            }
            else if(i == array.length - 1)
            {
                if(array[i] == total)
                {
                    count++;
                }
            }
            else
            {
                int sum = 0;
                for(int j = i; j < array.length - 1; j++)
                {
                    sum = sum + array[j];
                    for(int k = j + 1; k < array.length; k ++)
                    {
                        if(sum + array[k] == total)
                        {
                            count++;
                        }
                    }
                }
            }
          
            // System.out.println(count);
        }
        return count;
    }
}

class SumArrayDemo
{
    public static void main(String args[])
    {
        int array[] = {2,4,6,10};
        int total = 16;
        SumArray sa = new SumArray();
        System.out.println(sa.sumArray(array, total));

    }
}

// works but code is not optimized
