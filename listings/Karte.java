import java.io.Serializable;

public class Karte implements Serializable {

	// Instanzvariablen
	public Farbe farbe;
	public byte zahl;

	// Die vier Farben als Enumeration
	public enum Farbe {
		Rot, Gelb, Grün, Blau;
	}
}