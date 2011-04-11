package Ligretto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RemoteServer extends Remote {
	void setPlayerReady(Player p) extends RemoteException;
    void setLigrettoStop() extends RemoteException;
}
