public class SubRectangleQueries {
    int rectangle[][];
    public SubRectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i <= row2; i++)
        {
            for(int j = col1; j <= col2; j++)
            {
                rectangle[i][j] = newValue;
            }
        }
    }
    
    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}

class SubRectangleQueriesDemo
{
    public static void main(String[] args) {
        int rectangle[][] = {{1,1,1},{2,2,2},{3,3,3}};
        SubRectangleQueries sr = new SubRectangleQueries(rectangle);
        System.out.println(sr.getValue(0, 0));
        sr.updateSubrectangle(1, 1, 2, 2, 20);
        System.out.println(sr.getValue(2, 2));
        for(int i = 0; i < rectangle.length; i++)
        {
            for(int j = 0; j < rectangle[0].length; j++)
            {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}