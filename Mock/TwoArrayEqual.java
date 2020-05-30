import java.util.Arrays;

public class TwoArrayEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        if(Arrays.equals(target, arr))
        {
            return true;
        }

        return false;
    }
}

class TwoArrayEqualDemo
{
    public static void main(String[] args) {
        int[] target = {1,2,3,4};
        int arr[] = {2,4,1,3};
        TwoArrayEqual t = new TwoArrayEqual();
        System.out.println(t.canBeEqual(target, arr));
    }
}