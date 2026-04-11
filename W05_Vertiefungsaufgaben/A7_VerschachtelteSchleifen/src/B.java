import ch.trick17.turtle4j.Turtle;

void main() {
	Turtle.setSpeed(1000);
	int length = 10;
	for (int i =1; i<=6; i++) {
		for (int j = 1; j <= 4; j++) {
			Turtle.forward(length);
			Turtle.right(90);
		}
		Turtle.penUp();
		Turtle.forward(length);
		Turtle.forward(10);
		Turtle.penDown();
		length += 10;
	}
}

