public class FirstBadVersion {

    public int firstBadVersion(int n) {

        int i = 1;
        int j = n;
        while(i < j)
        {
            int mid = (i + j) / 2;
            if(isBadVersion(mid))
            {
                j = mid;
            }
            else
            {
                i = mid + 1;
            }

        }
       
       return i;
        
    }
    
}

class FirstBadVersionDemo
{
    public static void main(String agrs[])
    {
        int n = 5;
        FirstBadVersion fv = new FirstBadVersion();
        System.out.println(fv.firstBadVersion(n));
    }
}

// basic concept is binary search but test case failed at 11