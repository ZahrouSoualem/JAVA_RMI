import java.rmi.registry.LocateRegistry;
import java.net.MalformedURLException;
import java.rmi.*;
public class Host1 {

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		// TODO Auto-generated method stub
		LocateRegistry.createRegistry(1099);
		Service_H1 serviceH1 = new Service_H1();
		Naming.bind("rmi://localhost:1099/OBJ", serviceH1);
		System.out.println("I'm server Host1 waiting for Client ... ");
	}

}
