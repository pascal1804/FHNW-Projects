void main() {
	Stein();
	Absatz();
	X();
	Absatz();
	Rakete();
}
//Grosse Elemente
void Stein() {
	Dach();
	V();
}
void X() {
	V();
	Dach();
}
void Rakete() {
	Dach();
	Rechteck();
	NASA();
	Rechteck();
	Dach();
}
void Absatz() {
	IO.println();
	IO.println();
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


