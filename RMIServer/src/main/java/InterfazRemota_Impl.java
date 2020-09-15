import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class InterfazRemota_Impl extends UnicastRemoteObject implements InterfazRemota {
    protected InterfazRemota_Impl() throws RemoteException {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int randomNumber() throws RemoteException {
        return new Random().nextInt(Integer.MAX_VALUE);
        // Podemos poner return 1; para comprobar que efectivamente, se obtiene el valor entrando en este método remoto.
    }
}
