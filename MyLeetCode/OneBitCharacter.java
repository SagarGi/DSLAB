
public class OneBitCharacter {

    public boolean isOneBitCharacter(int[] bits) {
        boolean result = false;

        for (int i = 0; i < bits.length; i++) {
            if (i == bits.length - 1) {
                result = true;
            }
            if (i == 1) {
                i++;
            }
        }

        return result;
    }

}

class OneBitCharacterDemo {
    public static void main(String[] args) {
        OneBitCharacter ob = new OneBitCharacter();
        int bits[] = { 0, 0, 1, 1, 1, 0, 0 };
        boolean result = ob.isOneBitCharacter(bits);
        System.out.println(result);
        // ob.isOneBitCharacter(bits);
    }
}

// it works fine but the code is not fine which is obvious