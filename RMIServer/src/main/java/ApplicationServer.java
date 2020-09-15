import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ApplicationServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(5099);
            registry.rebind("numero", new InterfazRemota_Impl());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
