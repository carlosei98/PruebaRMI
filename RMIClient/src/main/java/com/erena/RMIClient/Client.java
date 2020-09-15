package com.erena.RMIClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Client {
    public static final Logger logger = LoggerFactory.getLogger(Client.class);
    public static void main(String[] args) {
        try {
            System.setSecurityManager(new SecurityManager());
            LocateRegistry.getRegistry("localhost",5099);
            InterfazRemota service = (InterfazRemota) Naming.lookup("rmi://localhost:5099/numero");
            String num = String.valueOf(service.randomNumber());
            logger.debug(num);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
