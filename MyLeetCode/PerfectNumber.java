import java.util.ArrayList;
import java.util.List;

class PerfectNumber
{
    public boolean checkPerfectNumber(int num) {

        // int sum = 0;
        // List<Integer> list = new ArrayList<>();
        // for(int i = 1; i < num ; i++)
        // {
        //     if(num % i == 0)
        //     {
        //         list.add(i);
        //     }
        // }
        // System.out.println(list);

        // for(int i = 0; i < list.size(); i++)
        // {
        //     sum = sum + list.get(i);
        // }

        // System.out.println(sum);

        // if(sum == num)
        // {
        //     return true;
        // }

        // return false;

        // the above is niave approach

        List<Integer> list = new ArrayList<>(); // to store the divisor
        int sum = 0;
        if(num == 0 || num == 1)
        {
            return false;
        }

        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                if(!list.contains(i))
                {
                    int secondNum = num / i;
                    if(i == 1 || i == secondNum)
                    {
                        list.add(i);
                    }
                    else
                    {
                        list.add(i);
                        list.add(secondNum);
                    }
                }
                else
                {
                    break;
                }
            }
        }

        for(Integer i : list)
        {
            sum = sum + i;
        }

        if(sum == num)
        {
            return true;
        }

        System.out.println(list);
        return false;
    }
}

class PerfectNumberDemo
{
    public static void main(String[] args) {
        int num = 28;
        PerfectNumber pn = new PerfectNumber();
        System.out.println(pn.checkPerfectNumber(num));
    }
}