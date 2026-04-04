class Art {
	void main() {
		Stein();
		X();
		Rakete();
	}
	//Grosse Elemente
	void Stein() {
		Dach();
		V();
		IO.println();
		IO.println();
	}
	void X() {
		V();
		Dach();
		IO.println();
		IO.println();
	}
	void Rakete() {
		Dach();
		Rechteck();
		NASA();
		Rechteck();
		Dach();
	}
	//Teilstücke
	void Dach() {
		IO.println("   /\\  ");
		IO.println();
		IO.println("  /  \\ ");
		IO.println();
		IO.println(" /    \\");
		IO.println();
	}
	void V() {
		IO.println(" \\    /");
		IO.println();
		IO.println("  \\  / ");
		IO.println();
		IO.println("   \\/  ");
		IO.println();
}
	void Rechteck() {
		LinieHorizontal();
		LinieVertikal("      ");
		LinieVertikal("      ");
		LinieHorizontal();
	}
	void NASA() {
		LinieVertikal("  **  ");
		LinieVertikal(" NASA ");
		LinieVertikal("  **  ");
	}
	//Zeilen
	void LinieHorizontal() {
		IO.println("+------+");
		IO.println();
	}
	void LinieVertikal(String platzhalter) {
		IO.println("|" + platzhalter + "|");
		IO.println();
	}
}

