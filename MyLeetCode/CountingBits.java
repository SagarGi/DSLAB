public class CountingBits {
    public int getCount(int num , int[] result)
    {
        if(num == 0)
        {
            return 0;
        }
        if(num == 1)
        {
            return 1;
        }

        if(result[num] != 0)
        {
            return result[num];
        }

        if(num % 2 == 0)
        {
            result[num] = getCount(num/2, result);
            return getCount(num/2 , result);
        }
        else
        {
            result[num] = 1 + getCount(num/2, result);
            return 1 + getCount(num/2 , result);
        }

    }
    public int[] countBits(int num) {
        int  result[] = new int [num + 1]; // since we have to include count  zero also

        for(int i = 0; i <= num; i++)
        {
            result[i] = getCount(i, result);
        }
        return result;
    }
}

class CountingBitsDemo
{
    public static void main(String[] args) {
        int num = 7;
        CountingBits cb = new CountingBits();
        int result[] = cb.countBits(num);
        for(Integer i : result)
        {
            System.out.print(i + "\t");
        }
    }
}