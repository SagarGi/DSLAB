public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int newArray[][] = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++)
        {
            int j = A[0].length - 1;
            int k = 0;
            while(j >= 0)
            {
                newArray[i][k] = A[i][j];
                if(newArray[i][k] == 0)
                {
                    newArray[i][k] = 1;
                }
                else
                {
                    newArray[i][k] = 0;
                }
                k++;
                j--;
            }
        }

        return newArray;
    }
}

class FlipAndInvertImageDemo
{
    public static void main(String[] args) {
        FlipAndInvertImage fp = new FlipAndInvertImage();
        int A[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int result [][]= fp.flipAndInvertImage(A);

        for(int i = 0; i < result.length; i++)
        {
            for(int j = 0; j < result[0].length; j++)
            {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}