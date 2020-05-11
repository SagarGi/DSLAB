/**
 *       *                      *
 *          *               *
 *              *       *
 *                  *
 */

import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // char c = scanner.next().charAt(0);
        char c = '*';
        System.out.println("\n\n");
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 6 * 2 -1; k > (i * 2); k--)
            {
                if(k == 6 * 2 - 1 || k == (i * 2) + 1)
                {
                    System.out.print(c);
                }
                else
                {
                    System.out.print(" ");
                }
               
            }

            System.out.println("");
        }
        
    }
}