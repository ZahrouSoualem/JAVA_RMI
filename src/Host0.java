import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.rmi.*;

public class Host0 {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub

		System.out.println("I'm a Client Host0 ....");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please assign to A number =");
		int a = scanner.nextInt();
		System.out.println("Please assign to B number =");
		int b = scanner.nextInt();
		int n = 3;
		double[] H1 = {7,5,6};
		int[] H2 = {2,8,5};
		
		//this is for Host1
		System.out.println("I packed the data to Host1");
		ServiceH1Remote serviceH1remote = (ServiceH1Remote)Naming.lookup("rmi://localhost:1099/OBJ");
		double[] resultH1 = serviceH1remote.OperationH1(a, H1);
		System.out.print("I got this result from Host1 ... " );
		for(int i =0 ; i<resultH1.length;i++) System.out.print(resultH1[i] +" ");
		
		System.out.println();
		System.out.println();
		
		//this is for Host2
		System.out.println("I packed the data to Host2");
		ServiceH2Remote serviceH2remote = (ServiceH2Remote)Naming.lookup("rmi://localhost:1098/OBJ");
		int[] resultH2 = serviceH2remote.OperationH2(b, H2);
		System.out.print("I got this result from Host2 ... " );
		for(int value : resultH2 ) System.out.print(value +" ");
		
		System.out.println();
		System.out.println();
		
		//the finale result for W 
		double result ;
		System.out.print(" W = U + V = { ");
		for(int i =0 ; i<resultH1.length;i++) {
			result = resultH2[i]+resultH1[i]; 
			System.out.print(result +" ");
		}
		System.out.print(" } ");
	}

}
