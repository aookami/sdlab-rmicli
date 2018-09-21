package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientActv {
	public static void main(String[] args){
		try {
			Client client = new ClientImpl();
			Registry refSN =  LocateRegistry.getRegistry(1099);
			
			
			Server a = (Server) refSN.lookup("server");
			a.call("AAA", client);	
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
