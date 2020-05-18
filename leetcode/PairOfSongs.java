import java.util.Arrays;

public class PairOfSongs {

    public int numPairsDivisibleBy60(int[] time) {
        // int result = 0;
        // for(int i = 0; i < time.length - 1; i++)
        // {
        //     for(int j = i + 1; j < time.length; j++)
        //     {
        //         if((time[i] + time[j]) % 60 == 0)
        //         {
        //             result++;
        //         }
        //     }
        // }
        // return result;

        // ---------> the niave approach got time limit exceeded;

        int result = 0;
        
        return 0;
    }

}

class PairOfSongsDemo
{
    public static void main(String[] args) {
        int time[] = {60,60,60};
        PairOfSongs ps = new PairOfSongs();
        System.out.println(ps.numPairsDivisibleBy60(time));
    }
}