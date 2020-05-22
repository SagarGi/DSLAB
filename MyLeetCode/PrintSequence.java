// print the sequence 5,1,4,2,3,3,2,4,1,5

public class PrintSequence {

    public static void main(String args[])
    {
        int j = 1;
        for(int i = 10; i >0; i--)
        {
            System.out.print(i + "\t" + j + "\t");
            j++;
        }
    }
    
}