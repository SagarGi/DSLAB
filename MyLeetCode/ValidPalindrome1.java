public class ValidPalindrome1 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        System.out.println(s);
        // let us do with 2 pointer method
        int start = 0;
        int end = s.length() - 1;
        while(start <= end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

class ValidPalindrome1Demo
{
    public static void main(String[] args) {
        ValidPalindrome1 c = new ValidPalindrome1();
        String s = "race a car";
        System.out.println(c.isPalindrome(s));
    }
}