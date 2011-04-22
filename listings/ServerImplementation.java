import java.rmi.RemoteException;
import java.util.List;

public class ServerImplementation implements Server {

	// Instanzvariablen
	private List<Spieler> spieler;
	private List<List<Karte>> decks;

	// Methodenimplementation
	public static void ligrettoStop() throws RemoteException { ... }
}