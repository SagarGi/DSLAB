import java.util.Scanner;

public class ArrayRotation
{
    public int[] rotateRight(int array[])
    {
        for(int i = array.length - 1; i > 0; i--)
        {
            int temp = array[i];
            array[i] = array[i-1];
            array[i-1] = temp;
        }
        return array;
    }

    public int[] rotateLeft(int array[])
    {
        for(int i = 0; i  < array.length - 1; i++)
        {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
        return array;
    }
    public int[] rotate(int array[], char c)
    {
        int userinput = Character.toUpperCase(c);
        switch(userinput)
        {
            case 'R' : return rotateRight(array);
            case 'L' : return rotateLeft(array);
            default: break;
        }
        return new int[0];
    }
}

class ArrayRotationDemo
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        int array[] = {1,2,3,4,5};
        ArrayRotation ar = new ArrayRotation();
        int result []= ar.rotate(array, c);
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}