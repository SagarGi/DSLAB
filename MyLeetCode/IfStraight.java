public class IfStraight {

    public boolean checkStraightLine(int[][] coordinates) {
    //    the ideas is to find the slope where slope defines the straight line
        boolean ans = true;
        double slope = (double)(coordinates[1][1]  - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        System.out.println(slope);

        for(int i = 2; i < coordinates.length; i++)
        {
            double tempSlope = (double)(coordinates[i][1]  - coordinates[0][1]) / (coordinates[i][0] - coordinates[0][0]);
           
            System.out.println(tempSlope);
            if(slope != tempSlope)
            {
                ans = false;
                break;
            }
        }
        return ans;
    }
    
}

class IfStraightDemo
{
    public static void main(String[] args) {
        IfStraight is = new IfStraight();
        int [][] coordinates = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(is.checkStraightLine(coordinates));

    }
}