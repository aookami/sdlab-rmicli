package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientImpl extends UnicastRemoteObject implements  Client{

	
	private static final long serialVersionUID = 1L;

	protected ClientImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void echo() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(this.toString() + " ECHO");
		
	}
	
	
	
}
