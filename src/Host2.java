import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Host2 {

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		// TODO Auto-generated method stub
		LocateRegistry.createRegistry(1098);
		Service_H2 serviceH2 = new Service_H2();
		Naming.bind("rmi://localhost:1098/OBJ", serviceH2);
		System.out.println("I'm server Host2 waiting for Client ... ");

	}

}
