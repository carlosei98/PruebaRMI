package com.erena.RMIServer;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ApplicationServer {
    public static void main(String[] args) {
        try {
            System.setSecurityManager(new SecurityManager());
            Registry registry = LocateRegistry.createRegistry(5099);
            registry.bind("numero", new InterfazRemota_Impl());

        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
