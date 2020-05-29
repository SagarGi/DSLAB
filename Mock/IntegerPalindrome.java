public class IntegerPalindrome
{
    public boolean isPalindrome(int x) {
        int num = x;
        if(x < 0)
        {
            return false;
        }

        int reversed = 0;
        while(x > 0)
        {
            reversed = (reversed * 10) + x % 10;
            x = x / 10;
        }

        System.out.println(reversed);

        if(reversed == num)
        {
            return true;
        }
        return false;
    }
}

class IntegerPalindromeDemo
{
    public static void main(String[] args) {
        int x = 121;
        IntegerPalindrome ip = new IntegerPalindrome();
        System.out.println(ip.isPalindrome(x));
    }
}