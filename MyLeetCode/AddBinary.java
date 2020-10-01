
public class AddBinary {

    public String addBinary(String a, String b) {
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;

        // in addition we need carray
        int carry = 0;

        // string builder to store the reuslt
        StringBuilder result = new StringBuilder();

        while (aLength >= 0 || bLength >= 0) {
            int sum = carry; // each time sum = carry for next iteration

            if (aLength >= 0) {
                sum = sum + Character.getNumericValue(a.charAt(aLength));
                aLength--;
            }

            if (bLength >= 0) {
                sum = sum + Character.getNumericValue(b.charAt(bLength));
                bLength--;

            }

            if (sum <= 1) {
                result.append(sum);
                carry = 0;
            } else {
                result.append(sum % 2); // which is the binary form
                carry = 1;
            }
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();

    }

}

class AddBinaryDemo {
    public static void main(String args[]) {
        AddBinary ab = new AddBinary();
        String result = ab.addBinary("1010", "1011");
        System.out.println(result);
    }
}
