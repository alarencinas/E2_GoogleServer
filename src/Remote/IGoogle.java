package Remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IGoogle extends Remote {
	public boolean checkGoogleUser(String email,String password)throws RemoteException;
}
