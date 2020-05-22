public class RunLengthEncoding
{
    public void runLengthEncoding(String value)
    {
        String runLenString = "";
        int k = 0;

        
        while(k < value.length())
        {
            int count = 0;
            for(int i = k; i < value.length(); i++)
            {
                if(value.charAt(k) == value.charAt(i))
                {
                    count = count + 1;
                  
                }
                else
                {
                    break;
                }
            }

            runLenString = runLenString +  value.charAt(k) + Integer.toString(count);
            k = k + count;
        }

        System.out.println(runLenString);
            
       
    }
}
class RunLengthEncodingDemo
{
    public static void main(String  []args)
    {
        RunLengthEncoding run = new RunLengthEncoding();
        String value = "Sagar";
        // String result = run.runLengthEncoding(value);
        // System.out.println(result);
        run.runLengthEncoding(value);
    }
}