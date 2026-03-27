public class Körpergrösse {
	public static void main(String[] args) {
		String Geschlecht = IO.readln("Bist du männlich oder weiblich?");
		String Grösse = IO.readln("Wie gross bist du in cm?");

		int Körpergrösse = Integer.parseInt(Grösse);
		if (Geschlecht .equals ("männlich")) {
			if (Körpergrösse > 177.6) {
				IO.println("Du bist grösser als ein durchschnittlicher Mann!");
			} else {
				IO.println("Du bist kleiner als ein durchschnittlicher Mann!");
			}
		} else if (Geschlecht .equals ("weiblich")) {
			if (Körpergrösse > 164.7) {
				IO.println("Du bist grösser als eine durchschnittliche Frau!");
			} else {
				IO.println("Du bist kleiner als eine durchschnittliche Frau!");
			}
		}
	}
}
