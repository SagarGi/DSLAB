import java.util.Arrays;

/**
 *          given an array coonsider the following output
 *          input[2,7,4,5,7,1,8,3]
 * 
 *          output[8,1,7,2,7,3,5,4]
 */



public class UpDownArray { 

    public int rotateCircular(int array[])
    {
        for(int i = array.length - 1; i > 0; i--)
        {
            // swap last to first
            int temp = array[i];
            array[i] = array[i -1];
            array[i-1] = temp;
        }
        return array[0];
    }
    public static void main(String[] args) {
        int array[] = {2,7,4,5,7,1,8,3};
        UpDownArray uda = new UpDownArray();
        // first sort it out
       
        Arrays.sort(array);

      
        for(int i = 0; i < array.length; i = i + 2)
        {
            for(int j = array.length - 1; j > i; j--)
            {
                // swap last to first
                int temp = array[j];
                array[j] = array[j -1];
                array[j-1] = temp;
            }
        }
        
        for(Integer i : array)
        {
            System.out.println(i);
        }
    }
}

// complexity is O(n2) but works fine

