package rmi;

import java.rmi.Remote;

public interface Server extends Remote {
	
	void call(String a, Client b);
	
	

}
