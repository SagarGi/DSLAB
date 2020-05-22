public class CanPlaceFlower {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        boolean result = false;
        int count = 0;
        if(flowerbed.length == 1 && flowerbed[0] == 0 && n <= 1)
        {
            result = true;
        }
        else if(flowerbed.length == 2)
        {
            if(flowerbed[0] == 0 && flowerbed[1] == 0 && n <= 1)
            {
                result = true;
            }
        }
        else
        {
            for(int i = 0; i < flowerbed.length; i++)
            {
                if(i == 0)
                {
                    if(flowerbed[i] == 0 && flowerbed[i + 1] == 0)
                    {
                        count++;
                        flowerbed[i] = 1;
                    }
                }
                else if(i == flowerbed.length -1)
                {
                    if(flowerbed[i-1] == 0 && flowerbed[i] == 0)
                    {
                        count++;
                        flowerbed[i] = 1;
                    }
                }
                else
                {
                    if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[ i+ 1] == 0)
                    {
                        count++;
                        flowerbed[i] = 1;
                    }
                }
            }
        }

        System.out.println(count);

        if(n <= count)
        {
            result = true;
        }
        return result;
        
    }
    
}

class CanPlaceFlowerDemo
{
    public static void main(String args[])
    {
        int flowerbed[] = {0,0,1,0,0,0,1};
        int n = 2;
        CanPlaceFlower cpf = new CanPlaceFlower();
        System.out.println(cpf.canPlaceFlowers(flowerbed, n));
    }
}

// code works but is not optimised