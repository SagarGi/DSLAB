public class PatternFour {
    public static void main(String[] args) {
        //the space method

        for(int i = 1; i < 5; i++)
        {
            for(int j = i; j < 5; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k < 2 * i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}