import java.util.ArrayList;
import java.util.List;

public class Intersection {

    public ArrayList intersectionElement(int[] array1, int[] array2)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(Integer i : array1)
        {
            if(!a.contains(i))
            {
                for(int j = 0; j < array2.length; j++)
                {
                    if(i == array2[j])
                    {
                        a.add(i);
                    }
                }
            }
            
        }
        return a;
    }
    
}

class IntersectionDemo
{
    public static void main(String args[])
    {
        int array1[]  = {1,4,7,5,9,2,1};
        int array2[] = {1,7,3,4,5};
        Intersection i = new Intersection();
        System.out.println(i.intersectionElement(array1, array2));

    }
}