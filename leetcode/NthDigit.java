public class NthDigit {

    public int findNthDigit(int n) {

        int first = 1;
        int last = 9;
        int length = 1;

        while(n > length * last)
        {
            n = n - (length * last); // to decrease the no of the 1,2,3.... digits and so son
            length++;
            first = first * 10;
            last = last * 10;
        }
        // up to here we get the length of the string 

        // now we find the exact digits where it falls

        first = first + (n - 1) / length; // gives the no which contains the nth digits
        int index = (n-1)%length; // gives the index in which the nth digit lies

        String s = Integer.toString(first);
        char nthString = s.charAt(index);
        
        return Character.getNumericValue(nthString);
        
    }
    
}

class NthDigitDemo
{
    public static void main(String args[])
    {
        int n =1000;
        NthDigit nth = new NthDigit();
        System.out.println(nth.findNthDigit(n));
    }
}