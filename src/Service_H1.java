import java.util.Scanner;
import java.rmi.RemoteException;
import java.rmi.server.*;

public class Service_H1 extends UnicastRemoteObject implements ServiceH1Remote{
	
	protected Service_H1() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double[] OperationH1(int a, double[] U) {
		// TODO Auto-generated method stub
		System.out.println(" I have received information a = "+a+" from the client ");
		for(int i = 0;i<U.length;i++) U[i]=Math.sqrt(a)*U[i];
		return U;
	}
	
}
