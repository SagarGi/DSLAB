public class JewelsAndStone {

    public int numJewelsInStones(String J, String S) {
        int jewelAsStone = 0;

        for(int i = 0; i < J.length(); i++)
        {
            for(int j = 0; j < S.length(); j++)
            {
                if(J.charAt(i) == S.charAt(j))
                {
                    jewelAsStone++;
                }
            }
        }

        return jewelAsStone;
        
    }
    
}
class JewelsAndStoneDemo
{
    public static void main(String args[])
    {
        String J = "z";
        String S = "ZZ";
        JewelsAndStone js = new JewelsAndStone();
        System.out.println(js.numJewelsInStones(J, S));
    }
}