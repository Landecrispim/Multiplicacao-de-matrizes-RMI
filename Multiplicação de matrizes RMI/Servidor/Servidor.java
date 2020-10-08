package Servidor;



import interfaces.matDistribuido;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor {

    public Servidor() {
          try {
            System.setProperty("java.rmi.server.hostname", "localhost");
            LocateRegistry.createRegistry(1099);
            matDistribuido c = (matDistribuido) new Mult_mat();
            Naming.bind("Servico", (Remote) c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Servidor();
    }

    }
    
    
    
    

   

    
    
    


