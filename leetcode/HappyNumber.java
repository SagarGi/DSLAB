
public class HappyNumber {

    public boolean isHappy(int n)
    {
        boolean answer = false;
        int count = 0;
        int number = n;

        while(answer == false)
        {
            while(n != 0)
            {
                n = n / 10;
                count ++;
    
            }
    
            int sum = 0;
            
            for(int i = 0; i < count; i++)
            {
               int splitNumber = number % 10;
               sum = sum + (splitNumber * splitNumber);
               number = number / 10;
            }
            
            System.out.println(sum);
            if(sum == 0)
            {
                answer = true;
            }
            else
            {
                number = sum;
            }
        }
           
       
        return answer;
    }

    public static void main(String args[])
    {
        int n = 19;
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(n));
    }

}

// done with perfection