import java.rmi.*;

public interface Hello extends Remote
{
    //this is a remote interface
    // String sayHello() throws RemoteException;
    public int add(int a, int b) throws RemoteException;
}