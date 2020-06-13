import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom
{
    HashMap<Integer, Integer> map;
    List<Integer> list;
    public InsertDeleteGetRandom()
    {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    public boolean insert(int val) {
        if(map.containsKey(val))
        {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val))
        {
            return false;
        }

        // swap in array list
        int index = map.get(val);
        Collections.swap(list, index, list.size() - 1);

        int swappedElement = list.get(index);
        map.put(swappedElement, index);
        list.remove(list.size() - 1);
        map.remove(val);

        return true;


    }

    public int getRandom() {
        Random random = new Random();
        int n = random.nextInt(list.size());
        return list.get(n);
    }

}

class InsertDeleteGetRandomDemo
{
    public static void main(String[] args) {
        InsertDeleteGetRandom idr = new InsertDeleteGetRandom();
        idr.insert(1);
        idr.insert(6);
        idr.insert(5);
        idr.insert(4);
        idr.insert(4);


    }
}