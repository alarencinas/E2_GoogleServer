package Remote;

import java.rmi.Remote;

public interface IGoogle extends Remote {
	public boolean checkGoogleUser(String email,String password);
}
