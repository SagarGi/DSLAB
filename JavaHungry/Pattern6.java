/*
                5
               54
              543
             5432
            54321
*/

public class Pattern6 {
    public static void main(String[] args) {
        for(int i = 5; i > 0; i--)
        {
            for(int j = i; j > 0; j--)
            {
                System.out.print(" ");
            }

           for(int k = 5; k >= i; k--)
           {
               System.out.print(k);
           }
            System.out.println();
        }
    }
}