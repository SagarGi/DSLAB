import java.io.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
public class Client
{

    public Client()
    {

    }

    public static void main(String args[])
    {
        String host = (args.length <1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Hello stub = (Hello) registry.lookup("Hello");
            System.out.println("The sum is: " + stub.add(5,5));
        } catch (Exception e) {
           System.out.println(e);
        }

    }
}