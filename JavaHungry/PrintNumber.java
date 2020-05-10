public class PrintNumber {

    public void recursionPattern(int n)
    {
        System.out.println(n);
        if(n < 0)
        {
            return;
        }
        recursionPattern(n - 5);
        System.out.println(n);
    }
    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();
        int n = 16;
        pn.recursionPattern(n);
    }
    
}