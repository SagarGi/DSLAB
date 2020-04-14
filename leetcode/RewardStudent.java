
public class RewardStudent {

    public boolean rewardBestStudent(String record)
    {
        int countAbsent = 0; 
        int countLate = 0;
        boolean result = true;
        for(int i = 0; i < record.length(); i++)
        {
            if(record.charAt(i) == 'A')
            {
                countAbsent++;
            }
            else if(record.charAt(i) == 'L')
            {
                countLate++;
            }

        }

        if(countAbsent > 1 || countLate > 2)
        {
            result = false;
        }

        return result;
        
    }

}

class RewardStudentDemo
{
    public static void main(String args[])
    {
        RewardStudent rs = new RewardStudent();
        String record = "PALLA";
        boolean result = rs.rewardBestStudent(record);
        System.out.println(result);
    }
}

