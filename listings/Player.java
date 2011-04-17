package Ligretto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

//Interface des Clients. Wird hauptsaechlich von andern Clients oder dem Server angesprochen.
public interface Player extends Remote {
	
	//Ligretto Start Event (Vom Server)
    void startGame() throws RemoteException; 
    
    //Ligretto Stop Event (Vom Server)
    void stopGame() throws Remote Exception; 
    
    //Player bekommt seine Handkarten (Vom Server)
    void setHandKarten() throws RemoteException;

    //Player bekommt seine direkten Nachbarn mitgeteilt. (Vom Server)
    void setNachbarn(List<RemoteClient> nachbarnListe) throws RemoteException;
    
    // KI: Kann sich die Sichtbaren Karten abholen 
    List<Karte> getSichtbareKartenListe() throws RemoteException;
    
    // KI: Kann sich die oberste Karte des Ablagestapels des Gegners abholen.
    Karte getAblageStapelKarte() throws RemoteException;
    
    // KI: Kann sich die Stapel des Spielers abholen mit Stapeln die noch nicht auf 10 sind. (Minimum 0, Maximum 4).
    List<Stapel> getStapelListe() throws RemoteException;
}
