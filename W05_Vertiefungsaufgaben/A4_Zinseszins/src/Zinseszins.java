void main() {
	String anfangskontostand = IO.readln("Anfangskontostand?");
	double aktuellerKontostand = Double.parseDouble(anfangskontostand);

	String zinssatzString = IO.readln("Zinssatz in %?");
	double zinssatz = Double.parseDouble(zinssatzString) / 100;

	String anzahlJahreString = IO.readln("Anzahl Jahre?");
	int anzahlJahre = Integer.parseInt(anzahlJahreString);

	int aktuellerKontostandFr = 0;
	int aktuellerKontostandRp = 0;

	for (int i = 1; i <= anzahlJahre; i++) {
		aktuellerKontostand += (aktuellerKontostand * zinssatz);
                       aktuellerKontostandFr = (int) aktuellerKontostand;
		aktuellerKontostandRp = (int) (aktuellerKontostand * 100) % 100;
		IO.println("Der Kontostand nach " + i + " Jahren beträgt: " + aktuellerKontostandFr + "." + aktuellerKontostandRp + " CHF");
	}
	if (aktuellerKontostand < 0) {
		IO.println("Der Kontostand muss midestens 0 CHF betragen");
	}
}

