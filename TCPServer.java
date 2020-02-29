import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Scanner scanner = new Scanner(System.in);
        try {
            ss = new ServerSocket(6666);
            Socket s = ss.accept();// establishes connection
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream doutserver = new DataOutputStream(s.getOutputStream());
            String serverMessage = "";
            while (true) {
                String str = (String) dis.readUTF();
                System.out.println("Client= " + str);
                serverMessage = scanner.nextLine();
                doutserver.writeUTF(serverMessage);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}