import ch.trick17.turtle4j.Turtle;

void main() {
	Turtle.setSpeed(1000);
	for (int i = 50; i < 300; i += 5) {
		Turtle.forward(i);
		Turtle.right(90);
	}
}

