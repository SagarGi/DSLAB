

public class RotateString {
   
    public boolean rotateString(String A, String B) {

        if(A.contains(B))
        {
            System.out.println("yes");
        }
        return(A.length() == B.length() && (A + A).contains(B));

        // from discussion
    }
}

class RotateStringDemo
{
    public static void main(String[] args) {
        String A = "aqa";
        String B = "qa";
        RotateString rs = new RotateString();
        System.out.println(rs.rotateString(A, B));
    }
}