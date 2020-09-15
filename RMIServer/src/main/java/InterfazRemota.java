import java.rmi.Remote;
import java.rmi.RemoteException;

// Interfaz quye va a ejecutar un método 'randomNumber' que devuelve un int aleatorio entre 0 y 0x7FFFFFFF (2^32-1)

public interface InterfazRemota extends Remote {
    public int randomNumber() throws RemoteException;
}
