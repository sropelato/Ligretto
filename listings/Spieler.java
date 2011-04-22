import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Spieler extends Remote {

	// Spieler mit Karten auszurüsten (vom Server)
	public void init(Server server, List<Spieler> nachbarn, List<Karte> karten) throws RemoteException;

	// Ligretto Start Event (vom Server)
	public void spielStarten() throws RemoteException; 
	
	// Karte legen (von anderen Spielern oder selber)
	public boolean legeKarte(Karte karte);
	
	// Ligretto Stop Event (vom Server)
	public void spielBeenden() throws Remote Exception; 
	
	// Punktestand ermitteln (vom Server)
	public byte getPunkte();
}
