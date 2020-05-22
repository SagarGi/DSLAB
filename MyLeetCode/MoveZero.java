
//  it does for 2 consecutive zeros.
//  while loop can be used for more than 2 consecutive zeros

// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]

public class MoveZero
{
    public void moveZero(int array[])
    {
        for(int i = 0; i < 5; i++)
        {
            if(array[i] == 0)
            {
                
                for(int j = i; j < array.length - 1; j++)
                {
                    // swaping in order
                    int swap;
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }

                if(array [i] == 0)
                {
                    for(int j = i; j < array.length - 1; j++)
                    {
                        int swap;
                        swap = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = swap;
                    }
                }
               
            }
           
        }

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

}

class MoveZeroDemo
{
    public static void main(String [] args)
    {
        int array[] = {0,1,0,3,12};
        MoveZero mz = new MoveZero();
        mz.moveZero(array);
    }
}