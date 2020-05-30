import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFrom {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        StringBuilder num1 = new StringBuilder();
        for(Integer i : A)
        {
            num1.append(i);
        }
        // String newNum = String.valueOf(sb.reverse());
        StringBuilder knum = new StringBuilder();
        while(K > 0)
        {
            knum.append(K % 10);
            K = K / 10;
        }
       
        String num2 = String.valueOf(knum.reverse());
        System.out.println(num2);

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0)
        {
            int sum = carry;
            if(i >= 0)
            {
                sum = sum + num1.charAt(i) - '0';
                i--;
            }
            if(j >= 0)
            {
                sum = sum + num2.charAt(j) - '0';
                j--;
            }
            list.add(sum % 10);
            carry = sum / 10;
        }

        if(carry != 0)
        {
            list.add(carry);
        }
        Collections.reverse(list);


        return list;
    }
}

class AddToArrayFromDemo
{
    public static void main(String[] args) {
        int A [] = {0};
        int K = 0;
        AddToArrayFrom add = new AddToArrayFrom();
        System.out.println(add.addToArrayForm(A, K));
    }
}