package Ligretto;

public final class Karte {
	public final Zahl zahl;
	public final Farbe farbe;
    public final Player owner;

	public Karte(Zahl zahl, Farbe farbe, Player owner ) {
		this.zahl = zahl;
		this.farbe = farbe;
        this.owner = owner;
	}

	public enum Zahl {
		_1(1), _2(2), _3(3), _4(4), _5(5), _6(6), _7(7), _8(8), _9(9), _10(10);

		public final int wert;

		Zahl(int wert) {
			this.wert = wert;
		}
	}

	public enum Farbe {
		Rot, Gelb, Gruen, Blau;
	}
}
