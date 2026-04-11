class Durchschnittsalter {
	void main() {
		//Anzahl Personen einlesen
		String anzahlPersonenString = IO.readln("Wie viele Personen?");
		int anzahlPersonen = Integer.parseInt(anzahlPersonenString);
		int gesamtAlter = 0;

		//Alter jeder Person abfragen
		for (int i = 1; i <= anzahlPersonen; i++) {
			String alterPersonString = IO.readln("Alter von Person " + i + "?");
			int alterPerson = Integer.parseInt(alterPersonString);
			gesamtAlter += alterPerson;
		}

		//Altersdurchschnitt berechnen und ausgeben
		double durchschnittsAlter = gesamtAlter / anzahlPersonen;
		IO.println("Das Durchschnittsalter ist " + durchschnittsAlter + " Jahre.");
	}
}
