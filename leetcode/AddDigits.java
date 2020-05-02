public class AddDigits {

    public int addDigits(int num) {

        int iterator = Integer.MAX_VALUE;

        while(iterator > 9)
        {
            int sum = 0;
            while(num > 0)
            {
                sum = sum + (num % 10);
                num = num / 10;
            }
            System.out.println(sum);
            num = sum;
            iterator = sum;
        }

        return iterator;
        
    }
    
}

class AddDigitsDemo
{
    public static void main(String args[])
    {
        int num = 0;
        AddDigits ad = new AddDigits();
        System.out.println(ad.addDigits(num));
    }
}