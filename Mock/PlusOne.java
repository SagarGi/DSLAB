public class PlusOne
{
    public int[] plusOne(int[] digits) {
    //    convert it as a string and then add 1 to it

       StringBuilder s = new StringBuilder();
       for(Integer i : digits)
       {
           s.append(i);
       }

       int carry = 1;
       int i = s.length() - 1;
       StringBuilder sb = new StringBuilder();
       while(i >= 0)
       {
           int sum = carry ; 
           sum = sum + Character.getNumericValue(s.charAt(i));

           sb.append(sum % 10);
           carry = sum / 10;
           i--;
       }

       if(carry != 0)
       {
           sb.append(carry);
       }
       sb.reverse().toString();

       System.out.println(sb);
       
       int resultArray[] = new int[sb.length()];

       for(int j = 0; j < sb.length(); j++)
       {
            resultArray[j] = sb.charAt(j) -'0';
       }

       return resultArray;
    }
}

class PlusOneDemo
{
    public static void main(String[] args) {
        int []digits = {9,9,9};
        PlusOne po = new PlusOne();
        int [] result = po.plusOne(digits);

        for(Integer i : result)
        {
            System.out.print(i + " ");
        }
    }
}