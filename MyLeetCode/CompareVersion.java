// works partially only


public class CompareVersion {

    public int compareVersion(String version1, String version2) {
        // My Version-----------------------------------------------------------
        // int ans = 0;
        // String removeDotsVersion1 = "";
        // String removeDotsVersion2 = "";
        // if(version1.contains(".") || version2.contains("."))
        // {
        //     System.out.println("contains!!");
        //     removeDotsVersion1 = version1.replace(".","").replaceAll("0+", "0");
        //     removeDotsVersion2 = version2.replace(".","").replaceAll("0+", "0");
        //     System.out.println(removeDotsVersion1);
        //     System.out.println(removeDotsVersion2);
        //     if(removeDotsVersion1.length() > removeDotsVersion2.length())
        //     {
        //         for(int i = removeDotsVersion2.length(); i < removeDotsVersion1.length(); i++)
        //         {
        //             removeDotsVersion2 = removeDotsVersion2 + "0";
        //         }
        //     }
        //     else
        //     {
        //         for(int i = removeDotsVersion1.length(); i < removeDotsVersion2.length(); i++)
        //         {
        //             removeDotsVersion1 = removeDotsVersion1 + "0";
        //         }
        //     }
        //     // comparision
    
        //     for(int i = 0; i < removeDotsVersion1.length(); i++)
        //     {
        //         if(removeDotsVersion1.charAt(i) != removeDotsVersion2.charAt(i))
        //         {
        //             if(removeDotsVersion1.charAt(i) > removeDotsVersion2.charAt(i))
        //             {
        //                 ans = 1;
        //                 break;
        //             }
        //             else
        //             {
        //                 ans = -1;
        //                 break;
        //             }
        //         }
        //     }
        // }
        // else
        // {
        //     System.out.println("Doesnot contain!!");
            
        //     if(Integer.valueOf(version1) == Integer.valueOf(version2))
        //     {
        //         return 0;
        //     }
        //     else if(Integer.valueOf(version1) > Integer.valueOf(version2))
        //     {
        //         return 1;
        //     }
        //     else
        //     {
        //         return -1;
        //     }
        // }
        // // System.out.println(ans);
        
        // return ans;


        // Disussion version
        String[] a = version1.split("[.]");
        String[] b = version2.split("[.]");
        int n = a.length;
        int m = b.length;
        
        for(int i = 0; i < Math.max(n, m); i++) {
            int valTemp1 = 0;
            int valTemp2 = 0;
           
            if(i < n)
            {
                valTemp1 = Integer.parseInt(a[i]);
            }
           
            if(i < m)
            {
                valTemp2 = Integer.parseInt(b[i]);
            }

            if(valTemp1 > valTemp2)
            {
                return 1;
            }
            if(valTemp2 > valTemp1)
            {
                return -1;
            }
        }
        return 0;
       

    }

}

class compareVersionDemo
{
    public static void main(String args[])
    {
        String version1 = "1.01";
        String version2 = "1.001";
        CompareVersion cv = new CompareVersion();
        System.out.println(cv.compareVersion(version1, version2));
        // cv.compareVersion(version1, version2);
    }
}