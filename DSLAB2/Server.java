import java.io.*;
import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
public class Server implements Hello
{
    public Server()
    {

    }

   public int add(int a, int b)
   {
       return (a + b);
   }

    public static void main(String args[])
    {
        try {
            Server server  = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(server,0); // 0 is anonymous port
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello",stub);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
}