import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindTownJudge
{
    public int findJudge(int N, int[][] trust) {
        int ans = -1;
        if(trust.length == 0)
        {
            return -1;
        }
        else
        {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < trust.length; i++)
            {
                if(!list.contains(trust[i][0]))
                {
                    list.add(trust[i][0]);
                }
            }
    
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < trust.length; i++)
            {
                if(!map.containsKey(trust[i][1]))
                {
                    map.put(trust[i][1], 1);
                }
                else
                {
                    map.put(trust[i][1], map.get(trust[i][1]) + 1);
                }
            }
                System.out.println(list);
            System.out.println(map);
            
            for(Integer i : map.keySet())
            {
                if(!list.contains(i) && map.get(i) == N - 1)
                {
                   return i;
                }
            }
        }
       
        return ans;
        
    }
}

class FindTownJudgeDemo
{
    public static void main(String[] args) {
        FindTownJudge ftj = new FindTownJudge();
        int N = 3;
        int trust[][] = {{1,2},{2,3}};
        System.out.println(ftj.findJudge(N, trust));

    }
}