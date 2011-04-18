import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {

	// Ligretto Stop Event (von Spieler)
	public void ligrettoStop() throws RemoteException;
}
