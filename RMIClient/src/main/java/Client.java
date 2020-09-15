import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) {
        try {
            InterfazRemota service = (InterfazRemota) Naming.lookup("rmi://localhost:5099/numero");
            int num = service.randomNumber();
            System.out.println("Número: "+ num +" desde: " + service.getClass().getName());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
