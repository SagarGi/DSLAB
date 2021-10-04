import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Socket s = null;
        try {
            s = new Socket("localhost", 8888);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            String message = "";
            DataInputStream dis = new DataInputStream(s.getInputStream());
            while (true) {
                message = scanner.nextLine();
                dout.writeUTF(message);
                String str = (String) dis.readUTF();
                System.out.println("Server= " + str);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}