import java.util.Stack;

public class FindingCelebrity {
    public int findCelebrity(int [][] matrix)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < matrix.length; i++)
        {
            stack.add(i);
        }

        while(stack.size() > 1)
        {
            int a = stack.pop();
            int b = stack.pop();

            if(matrix[a][b] == 0)
            {
                stack.push(a);
            }
            else

            {
                stack.add(b);
            }
        }

        int finalOne = stack.pop(); // might be a celebrity

        boolean isCelebrity = true;

        for(int i = 0; i < matrix.length; i++)
        {
            if(i == finalOne)
            {
                continue;
            }
            if(matrix[finalOne][i] == 1 || matrix[i][finalOne] == 0) // if he knows someone or all of the other mambers knows him
            {
                isCelebrity = false;
            }
        }

        if(!isCelebrity)
        {
            return -1;
        }

        System.out.println(stack);
        return finalOne;
    }
}

class FindingCelebrityDemo
{
    public static void main(String[] args) {
        int matrix[][] = {  {0, 0, 1, 0},
                            {0, 0, 1, 0},
                            {0, 0, 0, 0},
                            {0, 0, 1, 0}};

                            FindingCelebrity fc = new FindingCelebrity();
                            System.out.println(fc.findCelebrity(matrix));
    }
}