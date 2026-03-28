import ch.trick17.turtle4j.Turtle;

public class A {
	public void main() {
	Turtle.setSpeed(1000);
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				Turtle.right(60);
				Turtle.forward(100);
			}
			Turtle.left(60);
			Turtle.forward(100);
		}
	}
}
