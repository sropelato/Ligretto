package Ligretto;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {
	//Client teilt dem Server mit, dass er Ready ist.
    void setPlayerReady(Player p) extends RemoteException;
    //Ein Client teilt dem Server mit, dass er Ligretto Stop hat. Der Server verteilt es dann weiter an alle andern Clients.
    void setLigrettoStop() extends RemoteException;
    //Jeder Client meldet nach dem Spiel Ende dem Server seine erreichte Punktezahl mit.
    void setClientResultat(Player p, int resultat) extends RemoteException;
}