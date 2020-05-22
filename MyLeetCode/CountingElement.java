
public class CountingElement {

    public int countElement(int array[])
    {
        int countElement = 0;
        for(int i = 0; i < array.length; i++)
        {
            int x = array[i] + 1;
            for(int j = 0; j < array.length; j++)
            {
                 if(x == array[j])
                    {
                        countElement++;
                        break;
                    }
            }
        }
        return countElement;
    }

}

class CountingElementDemo
{
    public static void main(String args[])
    {
        int array[] = {1,3,2,3,5,0};
        CountingElement ce = new CountingElement();
        int count = ce.countElement(array); 
        System.out.println(count);
    }
}


