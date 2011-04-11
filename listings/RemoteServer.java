package Ligretto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * 
 * @author 
 */
public interface RemoteServer extends Remote {
	
	EventHandler getEventHandler() throws RemoteException;
	
	List<Karte> getHandKarten() throws RemoteException;
    
    void setReady(Player p) throws RemoteException;

	List<Stapel<Karte>> getStapel() throws RemoteException;
	
}
