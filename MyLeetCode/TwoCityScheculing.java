import java.util.Arrays;

public class TwoCityScheculing {
    public int twoCitySchedCost(int[][] costs) {
        int cost = 0;
        // use comparator
        Arrays.sort(costs, (a , b) -> 
        {
            return (a[0]- a[1]) - (b[0] - b[1]);
        });

        for(int i = 0; i < costs.length / 2; i++)
        {
            cost = cost + costs[i][0];
        }
        for(int i = costs.length / 2;  i < costs.length; i++)
        {
            cost = cost + costs[i][1];
        }
        
        return cost;
    }
}

class TwoCityScheculingDemo
{
    public static void main(String[] args) {
        TwoCityScheculing tcs = new TwoCityScheculing();
        int [][] costs = {{10,20},{30,200}, {400,50}, {30,20}};
        System.out.println(tcs.twoCitySchedCost(costs));
    }
}