import ch.trick17.turtle4j.Turtle;

void main() {
	Turtle.setSpeed(1000);
	Turtle.setPenWidth(2);
	Kreis(10);
	Uebergang(40, 60);
	Kreis(20);
	Uebergang(150,30);
	Wolke(25);
}
void Uebergang(int strecke, int winkel) {
	Turtle.penUp();
	Turtle.right(winkel);
	Turtle.forward(strecke);
	Turtle.left(winkel);
	Turtle.penDown();
}
void Kreis(int groesse) {
	for (int i = 1; i <= 180; i++) {
	        Turtle.forward(groesse * 2 * 3.1415 / 180);
        	Turtle.right(2);
	}
}
void Wolke(int groesse) {
	for (int bogen = 1; bogen <= 7; bogen++) {
       		for (int i = 1; i <= 90; i++) {
      			Turtle.forward(groesse * 2 * 3.1415 / 180);
       			Turtle.right(2);
		}
       		Turtle.left(180 - 360.0 / 7);
	}
}


