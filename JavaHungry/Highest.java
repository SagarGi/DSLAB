import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        int nums[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[0].length; j++)
            {
                nums[i][j] = scanner.nextInt();
                if(nums[i][j] > max)
                {
                    max = nums[i][j];
                }
            }
        }

        System.out.println("Max in the 2D array is = " + max);


    }
}