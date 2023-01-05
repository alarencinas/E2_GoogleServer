package Remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class GoogleService extends UnicastRemoteObject implements IGoogle {
	private static final long serialVersionUID=1l;
	private HashMap<String,String> GoogleH= new HashMap<>();
	private static GoogleService instance;
	private GoogleService() throws RemoteException {
		super();
	}
	public static GoogleService getInstance() {
		if (instance == null) {
			try {
				
				instance = new GoogleService();
			
			} catch(Exception ex) {
				
				System.err.println("  # Error initializing service(): " + ex.getMessage());
			
			}
		}
		
		return instance;
	}
	public boolean checkGoogleUser(String email,String password) {
		GoogleService.getInstance();
		GoogleH.put("German@gmail.com", "german");
		
		if(GoogleH.containsKey(email)) {
			if(GoogleH.get(email).matches(password)) {
				return true;
			}
		}
		return false;
	}
	
}
