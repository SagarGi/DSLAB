import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int result[] = new int[arr1.length];
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : arr1)
        {
            if(!map.containsKey(i))
            {
                map.put(i, 1);
            }
            else
            {
                map.put(i, map.get(i) + 1);
            }
        }

        //  sort key of hashmap
        TreeMap<Integer, Integer> sorted = new TreeMap<>(map);

        for(int i = 0; i < arr2.length; i++)
        {
            if(sorted.containsKey(arr2[i]))
            {
                for(int j = 0; j < sorted.get(arr2[i]); j++)
                {
                    list.add(arr2[i]);
                }

                sorted.remove(arr2[i]);
            }
        }

        for(Integer i : sorted.keySet())
        {
            for(int j = 0; j < sorted.get(i); j++)
            {
                list.add(i);
            }
        }
        System.out.println(list);
        int k = 0;
        for(Integer i : list)
        {
            result[k] = i;
            k++;
        }

        return result;
        
    }
}

class RelativeSortArrayDemo
{
    public static void main(String[] args) {
        int arr2[] = {2,1,4,3,9,6};
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};

        RelativeSortArray rsa = new RelativeSortArray();
        int [] result = rsa.relativeSortArray(arr1, arr2);

        for(Integer i : result)
        {
            System.out.print(i + "\t");
        }
    }
}