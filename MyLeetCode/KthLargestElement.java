
public class KthLargestElement {
    int k;
    int num[];

    public KthLargestElement(int k, int num[])
    {
        this.k = k;
        this.num = num;
    }

    public int add(int val)
    {
        int result = 0;
        int newNumb[] = new int[num.length + 1];
      
        for(int i = 0; i < num.length; i++)
        {
            newNumb[i] = num[i];
        }
        newNumb[num.length] = val;

        // do sorting first
        for(int i = 0; i < newNumb.length; i++)
        {
            for(int j = i + 1; j < newNumb.length; j++)
            {
                if(newNumb[i] > newNumb[j])
                {
                    // swap
                    int temp;
                    temp = newNumb[i];
                    newNumb[i] = newNumb[j];
                    newNumb[j] = temp;
                }
            }
        }

        num = newNumb;
        result = num[num.length-k];
        return result;
    }

}
class KthLargestElementDemo
{
    public static void main(String args[])
    {
        int k = 3;
        int num[] = {4,5,8,2};
        int val = 3;
        KthLargestElement ke = new KthLargestElement(k, num);
        ke.add(val);
        ke.add(5);
        ke.add(10);
        ke.add(9);
        int result = ke.add(4);
        System.out.println(result);
        
       
    }
}

// working fine but code is not efficient;