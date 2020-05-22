

// binary search using dive and conquer method using recursion

public class BinarySearch {

    int binarySearch(int array[], int low, int high, int number)
    {
        if(high >= low)
        {
            int mid = (low + high) / 2;

            if(array[mid] == number)
            {
                return mid;
            }
            else if(number > array[mid])
            {
                return binarySearch(array, mid + 1, high, number);
            }
            else
            {
                return binarySearch(array, low, mid-1, number);
            }
        }

        return -1;
    }

}

class BinaryDemo
{
    public static void main(String [] args)
    {
        int number = 10;
        int array[] = {10,20,30,40,50};
        int low = 0;
        int high = array.length -1;

        BinarySearch bs = new BinarySearch();
        int result = bs.binarySearch(array, low, high, number);
        if(result == -1)
        {
            System.out.println("Number is not found !!!");
        }
        else
        {
            System.out.println("Number is found at index " + result + " of the given array.");
        }
    }
}