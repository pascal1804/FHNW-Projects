void main() {
	String house = ("house that Jack built.");
	String cow = ("cow with the crunpled horn");

	for (int i = 1; i <= 7; i++) {
		if (i == 7) {
			Definition("maiden all forlorn");
			Context("milked ", cow);
		} if (i == 6) {
			Definition(cow);
		} if (i >= 6) {
			Context("tossed ", "dog");
		} if (i == 5) {
			Definition("dog");
		} if (i >= 5) {
			Context("worried ", "cat");
		} if (i == 4) {
			Definition("cat");
		} if (i >= 4) {
			Context("killed ", "the rat");
		} if (i == 3) {
			Definition("rat");
		} if (i >= 3) {
			Context("ate ", "malt");
		} if (i == 2) {
			Definition("malt");
		} if (i >= 2) {
			Context("lay in ", house);
		} if (i == 1) {
			Definition(house);
		}
		IO.println();
	}
}

void Definition(String thing) {
	IO.println("This is the " + thing);
}
void Context(String verb, String end) {
	IO.println("That " + verb + "the " + end);
}

