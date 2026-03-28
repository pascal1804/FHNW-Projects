import ch.trick17.turtle4j.Turtle;

public class Vielecke {
	public void main(String[] args) {
		String nEck = IO.readln("Wie viele Ecken soll das n-Eck haben?");
		int ecken = Integer.parseInt(nEck);
		int umfang = 600;
		for (int i = 1; i <= ecken; i++) {
			Turtle.forward(umfang/ecken);
			Turtle.right(360/ecken);
		}
	}
}
