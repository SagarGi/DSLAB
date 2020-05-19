/**
 *          * * * * * * * 
 *          *         *
 *          *       *
 *          *     *  
 *          *   *
 *          * *
 *          *    
 */

public class Pattern5 {
    public static void main(String[] args) {
        // row and column should be equal to each other
        for(int i = 6; i >= 0; i--)
        {
           for(int j = i; j >= 0; j--)
           {
               if(i == 0 || i == 6)
               {
                   System.out.print("*  ");
               }
               else
               {
                   if(j == i || j == 0)
                   {
                       System.out.print("*  ");
                   }
                   else
                   {
                       System.out.print("   ");
                   }
               }
           }
           System.out.println("");
        }
           
        }
      
    }
