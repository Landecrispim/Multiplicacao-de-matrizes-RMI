package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author lander
 */
public interface matDistribuido extends Remote{

    public void setdados()throws RemoteException;
    public void multiplicar()throws RemoteException;

    /**
     *
     * @throws RemoteException
     */
    public void resultado()throws RemoteException;
    public void setA(int[][] a)throws RemoteException;
    public void setB(int[][] b) throws RemoteException;
    public void setCA(int CA) throws RemoteException;
    public void setCB(int CB)throws RemoteException;
    public void setLA(int LA) throws RemoteException;
    public void setLB(int LB)throws RemoteException;
    public int[][] getAb() throws RemoteException;
    


}