import ch.trick17.turtle4j.Turtle;

void main() {
	var size = 220;

	Turtle.setSpeed(10000000);
	Turtle.right(90);
	Turtle.back(size);

	for (int i = 1; i <= 4; i++) {
		for (int y = 0; y < size; y += 10) {
			var x = size - y;
			var l = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // TODO
			var alpha = (360/(2*Math.PI)) * Math.asin(y/l); // TODO
			Turtle.left(alpha);
			Turtle.forward(l);
			Turtle.back(l);
			Turtle.right(alpha);
			Turtle.forward(10);
		}
		Turtle.left(90);
		Turtle.forward(size);
		Turtle.left(180);
	}
}
