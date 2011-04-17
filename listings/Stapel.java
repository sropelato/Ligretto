package Ligretto;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Jeder Player besitzt bis zu vier Stapel. Jeder dieser Stapel kann von andern Spielern abgefragt werden.
public interface Stapel extends Remote {
	
	//Versucht eine Karte oben auf den Stapel zu legen. Wirft TooSlowException, wenn die Karte von der Zahl her zu tief ist. Wenn die Zahl zu hoch oder die Farbe falsch ist wirft die Methode IllegalKarteException.
	void putTop(Karte karte) throws RemoteException, TooSlowException, IllegalKarteException;
    
    //KI: Kann die oberste Karte des Stapels auslesen.
    Karte getTop() throws RemoteException;
}
