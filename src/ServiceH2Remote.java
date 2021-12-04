import java.rmi.RemoteException;
import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.*;
public interface ServiceH2Remote extends Remote{
	
	public int[] OperationH2(int a,int[] V) throws RemoteException;

}
