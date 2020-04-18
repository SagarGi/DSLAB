// * * * * * * * 
// *           *
// *           *
// *           *
// * * * * * * * 

public class PrintSquare {

    public static void main(String args[])
    {
        for(int i = 0; i < 5; i++)
        {
           if(i == 0 || i == 4)
           {
               for(int j = 0; j < 5; j++)
               {
                    System.out.print("*\t");
               }
              
           }
           else{

                for(int j = 0; j < 5; j++)
                {
                    if(j > 0 && j < 4)
                    {
                        System.out.print("\t");
                        continue;
                    }
                    System.out.print("*\t");
                }

           }
           System.out.println("\n");
        }
    }

}