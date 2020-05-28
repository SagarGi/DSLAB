public class MinCostClimbingStairs
{
    public int minCostClimbingStairs(int[] cost) {
        // since we can start from index 1
        for(int i = 2; i < cost.length; i++)
        {
            int index0 = cost[i - 2];
            int index1 = cost[i -1];
            cost[i] = cost[i] + Math.min(index0, index1);
        }

        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}

class MinCostClimbingStairsDemo
{
    public static void main(String[] args) {
        int cost[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        MinCostClimbingStairs mcs = new MinCostClimbingStairs();
        System.out.println(mcs.minCostClimbingStairs(cost));
    }
}