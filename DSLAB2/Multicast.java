import java.io.*;
import java.net.*;

public class Multicast
{
    public static void main(String args[])
    {
        MulticastSocket socket = null;
        
        try {
            byte[] msg = args[1].getBytes();
            InetAddress group = InetAddress.getByName(args[0]);
            socket = new MulticastSocket(5678);
            DatagramPacket datagramPacket = new DatagramPacket(msg, msg.length,group,5678);
            socket.send(datagramPacket);
            System.out.println("Message sent!");
           
           
            for(int i = 1; i <= 5; i++)
            {
                byte[] buffer=new byte[500];  
                DatagramPacket rpack = new DatagramPacket(buffer, buffer.length);  
                socket.receive(rpack);
                System.out.println("Message " + new String(rpack.getData()));
            } 

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
