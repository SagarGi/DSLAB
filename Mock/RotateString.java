

public class RotateString {
   
    public boolean rotateString(String A, String B) {
        return(A.length() == B.length() && (A + A).contains(B));

        // from discussion
    }
}

class RotateStringDemo
{
    public static void main(String[] args) {
        String A = "aa";
        String B = "a";
        RotateString rs = new RotateString();
        System.out.println(rs.rotateString(A, B));
    }
}