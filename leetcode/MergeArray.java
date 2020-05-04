import java.util.Arrays;

public class MergeArray {

    public int[] mergeTwoArray(int array1 [], int array2[])
    {
        int newSize = array1.length + array2.length;
        int sortedArray[] = new int[newSize];

        // process
        // 1. lets sort both array first and then merge

        Arrays.sort(array1);
        Arrays.sort(array2);

        // 2. merge
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < array1.length && j < array2.length)
        {
            if(array1[i] < array2[j])
            {
                sortedArray[k] = array1[i];
                k++;
                i++;
            }
            else if(array1[i] > array2[j])
            {
                sortedArray[k] = array2[j];
                k++;
                j++;
            }
        }

        while(i < array1.length)
        {
            sortedArray[k] = array1[i];
            k++;
            i++;
        }
        while(j < array2.length)
        {
            sortedArray[k] = array2[j];
            k++;
            j++;
        }
    
        return sortedArray;
    }
    
}

class mergeTwoArray
{
    public static void main(String args[])
    {
        int array1[] = {2};
        int array2[] = {1};
        MergeArray mergeTwoArray = new MergeArray();
        int result[] = mergeTwoArray.mergeTwoArray(array1, array2);

        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }

    }
}