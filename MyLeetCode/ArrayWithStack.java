import java.util.ArrayList;
import java.util.List;

public class ArrayWithStack
{
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>(); 

        for(Integer i : target)
        {
            l.add(i);
        }

        for(int i = 1; i <= target[target.length - 1]; i++)
        {
            if(l.contains(i))
            {
                list.add("Push");
            }
            else
            {
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
        
    }

}

class ArrayWithStackDemo
{
    public static void main(String[] args) {
        int[] target = {1,3};
        int n = 3;
        ArrayWithStack a = new ArrayWithStack();
        System.out.println(a.buildArray(target, n));
    }
}