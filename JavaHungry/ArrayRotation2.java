public class ArrayRotation2 {
    public int [] arrayRotation2(int array[], int n)
    {
        while(n > 0)
        {
            for(int i = 0; i < array.length - 1; i++)
            {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
            n--;
        }
        
        return array;
    }
}

class ArrayRotation2Demo
{
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        int n = 3;

        ArrayRotation2 a2 = new ArrayRotation2();
        int result[] = a2.arrayRotation2(array, n);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + "\t");
        }
    }
}