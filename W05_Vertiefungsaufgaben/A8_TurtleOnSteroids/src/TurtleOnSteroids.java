import ch.trick17.turtle4j.Turtle;

void main() {
	Turtle.setSpeed(2147483647);
	double penWidth = 1;
	double strecke = 10;
	int winkel = 121;
	int farbton = 182;
	for (int j = 1; j <= 5; j++) {
		for (int k = 1; k <= 6; k++) {
			for (int i = 1; i <= 12; i++) {
				Turtle.setPenColor("hsl(" + farbton + ",100%,100%)");
				Turtle.setPenWidth(penWidth);
				Turtle.forward(strecke);
				Turtle.right(winkel);
				Turtle.forward(strecke);
				Turtle.left(winkel);
				strecke += 0.4;
				penWidth += 0.01;
				farbton++;
				if (farbton > 300) {
					farbton = 180;
				}
				Turtle.right(61);
			}
		}
		Turtle.forward(5);
		Turtle.left(10);
	}
}

