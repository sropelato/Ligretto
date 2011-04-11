package Ligretto;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Stapel extends Remote {
	Karte getObersteKarte() throws RemoteException;

	
	void legeKarte(Karte karte) throws RemoteException, TooSlowException;
}
