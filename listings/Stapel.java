package Ligretto;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Stapel extends Remote {
	Karte getObersteKarte() throws RemoteException;

	// Gibt null zurueck, wenn die Karte gelegt werden konnte, ansonsten wird die karte wieder zurueck gegeben. Echt?!
	Karte legeKarte(Karte karte) throws RemoteException;
}
