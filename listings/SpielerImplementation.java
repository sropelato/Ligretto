import java.rmi.RemoteException;
import java.util.List;
import java.util.Stack;

public class SpielerImplementation implements Spieler {

	// Instanzvariablen
	private Server server;
	private List<Spieler> nachbarn;
	private Stack<Karte> ligrettoStapel;
	private List<Stack<Karte>> spielStapel;
	private Stack<Karte> handKarten;
	private Karte[] slots;
	
	// Methodenimplementation
	public static void init(Server server, List<Spieler> nachbarn, List<Karte> karten) throws RemoteException { ...	}
	public static void spielStarten() throws RemoteException { ... }
	public static boolean legeKarte(Karte karte) throws RemoteException { ... }
	public static void spielBeenden() throws Remote Exception { ... }
	public static byte getPunkte() throws RemoteException { ... }
}