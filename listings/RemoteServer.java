package Ligretto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * 
 * @author 
 */
public interface RemoteServer extends Remote {
	
	EventHandler getGameEventHandler() throws RemoteException;
	
	List<? extends Karte> getHandkarten() throws RemoteException;

	List<? extends Stapel> getStapel() throws RemoteException;
	
}
