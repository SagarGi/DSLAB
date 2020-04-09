// Input: [4,1,2,1,2]
// Output: 4

public class SingleNumber
{
    public int singleNumber(int[] numbers)
    { 
        int count[] = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++)
        {
            count[i] = 0;
        }

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers.length; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    count[i]++;
                }
            }
        }

        int index = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            if(count[i] == 1)
            {
                index = i;
            }
        }
        return numbers[index];
    }
    public static void main(String [] args)
    {
        int []numbers = {4,5,4,1,2,1,2};
        SingleNumber sn = new SingleNumber();
        int answerNumber = sn.singleNumber(numbers);
        System.out.println("The number is :" + answerNumber);
    }
}

// done without non- linear runtime complexity
//  memory is consumed more
