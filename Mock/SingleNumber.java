
import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        for (int i : set) {
            return i;
        }

        return -1;
    }
}

class SingleNumberDemo {
    public static void main(String[] args) {
        int nums[] = { 4, 1, 2, 1, 2 };
        SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumber(nums));
    }
}