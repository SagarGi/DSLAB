public class AddString {

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
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

            sb.append(sum % 10);
            carry = sum / 10;
        }

        if(carry != 0)
        {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
    
}

class AddStringDemo
{
    public static void main(String[] args) {
        String num1 = "123111111";
        String num2 = "12113";
        AddString ass = new AddString();
        System.out.println(ass.addStrings(num1, num2));
    }
}