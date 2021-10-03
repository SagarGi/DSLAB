public class CanPlaceFlower {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        return count >= n;
    }

}

class CanPlaceFlowerDemo {
    public static void main(String args[]) {
        int flowerbed[] = { 0, 0, 1, 0, 0, 0, 1 };
        int n = 2;
        CanPlaceFlower cpf = new CanPlaceFlower();
        System.out.println(cpf.canPlaceFlowers(flowerbed, n));
    }
}

// code works but is not optimised

// i have optimized it