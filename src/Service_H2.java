import java.rmi.RemoteException;
import java.rmi.server.*;
public class Service_H2 extends UnicastRemoteObject implements ServiceH2Remote{

	protected Service_H2() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int[] OperationH2(int a, int[] V) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(" I have received information a = "+a+" from the client ");
		for(int i = 0;i<V.length;i++) V[i]=a*V[i];
		return V;
	}
}
