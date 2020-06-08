public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String result = "";
        char[] map = {'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};

        while(n > 0)
        {
            result = map[n % 26] + result;
            n = (n - 1) / 26;
        }
        return result;

    }
}

class ExcelSheetColumnTitleDemo
{
    public static void main(String[] args) {
        int n = 1;
        ExcelSheetColumnTitle es = new ExcelSheetColumnTitle();
        System.out.println(es.convertToTitle(n));
    }
}