package Ligretto;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * @author 
 */
public interface RemoteClient extends Remote {
	
	
    void startGame() throws RemoteException; //Ligretto Start Event
    
    void setHandKarten() throws RemoteException; //Player bekommt karten
    
    PlayerState getPlayerState() throws RemoteException; //Player state kann von andern Clients abgerufen werden.
    
    void legeKarte(Karte karte) throws RemoteException, TooSlowException; //Ein Client kann versuchen eine Karte zu legen.
    
    void stopGame() throws Remote Exception; //Ligretto Stop Event
	
}
