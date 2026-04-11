void main() {
	int grösse = parameterEinlesen();

	breite(grösse);
	IO.println();
	höhe(grösse);
	IO.println();
	boden(grösse);
}
int parameterEinlesen() {
	String grösseS = IO.readln("Grösse?");
	int grösse = Integer.parseInt(grösseS);
	return grösse;
}
void breite(int grösse) {
	IO.print(" .-");
	for (int i = 1; i <= grösse; i++) {
		IO.print("-");
	}
	IO.println(".");
}
void höhe(int grösse) {
	for (int j = 1; j <= grösse; j++) {
		IO.print(" | ");
		for (int i = 1; i <= grösse; i++) {
			IO.print(" ");
		}
	IO.println("|");
	}
}
void boden(int grösse) {
	IO.print("-----");
	for (int i = 1; i <= grösse; i++) {
		IO.print("-");
	}
}
