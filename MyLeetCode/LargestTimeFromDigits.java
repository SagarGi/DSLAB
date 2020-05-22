// this code completley doesnt work

public class LargestTimeFromDigits {

    public String firstPosition(int array[])
    {
        String firstchar = "";
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == 2)
            {
                firstchar = Integer.toString(array[i]);
            }
            if(array[i] == 1)
            {
                firstchar = Integer.toString(array[i]);
            }
            if(array[i] == 0)
            {
                firstchar = Integer.toString(array[i]);
            }
        }
        return firstchar;
    }

    public String secondPosition(int array[])
    {
        String secondChar = "";
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == 3)
            {
                secondChar = Integer.toString(array[i]);
            }
            if(array[i] == 2)
            {
                secondChar = Integer.toString(array[i]);
            }
            if(array[i] == 1)
            {
                secondChar = Integer.toString(array[i]);
            }
            if(array[i] == 0)
            {
                secondChar = Integer.toString(array[i]);
            }
        }
        return secondChar;
    }
    public String thirdPosition(int array[])
    {
        String thirdChar = "";
        for(int i = 0; i < array.length; i++)
        {
            switch(array[i])
            {
                case 0 : thirdChar = Integer.toString(array[i]);
                break;
                case 1 : thirdChar = Integer.toString(array[i]);
                break;
                case 2 : thirdChar = Integer.toString(array[i]);
                break;
                case 3 : thirdChar = Integer.toString(array[i]);
                break;
                case 4 : thirdChar = Integer.toString(array[i]);
                break;
                case 5 : thirdChar = Integer.toString(array[i]);
                break;
                case 6 : thirdChar = Integer.toString(array[i]);
                break;
            }
        }
        
        return thirdChar;
    }

    public String largestTimeFromDigits(int []array)
    {
        
        String largestTime = "";
        String hour = firstPosition(array) + secondPosition(array);
        String forthChar = "";

        for(int i = 0; i < array.length; i++)
        {
            if(Integer.toString(array[i]) == firstPosition(array) || Integer.toString(array[i]) == secondPosition(array) || Integer.toString(array[i]) == thirdPosition(array))
            {
                continue;
            }
            else
            {
                forthChar = array[i] + forthChar;
                break;
            }
        }

        if(hour.equals(""))
        {
            largestTime = "";
        }
        else{
            largestTime = hour + " : " + thirdPosition(array) + forthChar;
        }
    
        return largestTime;
    }

}

class LargestTimeFromDigitsDemo
{
    public static void main(String args[])
    {
        int array[] = {5,5,5,5};
        LargestTimeFromDigits lg = new LargestTimeFromDigits();
        String largesTime = lg.largestTimeFromDigits(array);
        System.out.println(largesTime);
    }
}