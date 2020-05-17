public class NumberOfStudentDoingHomework {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for(int i = 0; i < startTime.length; i++)
        {
            if(startTime[i] <= queryTime && endTime[i] >= queryTime)
            {
                count++;
            }
        }
        return count;
    }
}

class NumberOfStudentDoingHomeworkDemo
{
    public static void main(String[] args) {
        int[] startTime = {9,8,7,6,5,4,3,2,1};
        int[] endTime = {10,10,10,10,10,10,10,10,10};
        int queryTime = 5;

        NumberOfStudentDoingHomework ns = new NumberOfStudentDoingHomework();
        System.out.println(ns.busyStudent(startTime, endTime, queryTime));

    }
}