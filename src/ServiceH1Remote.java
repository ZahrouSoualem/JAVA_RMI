import java.rmi.*;

public interface ServiceH1Remote extends Remote {
	
	public double[] OperationH1(int a,double[] U) throws RemoteException;
}
