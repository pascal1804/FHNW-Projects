void main () {

		int x = (int)(Math.random() * 100) + 1;
		//double y = 9.1*x*x*x + 19.3*x*x -4.6*x + 34.2;
		double y = ((9.1*x + 19.3)*x - 4.6)*x +34.2;
		IO.println(x);
		IO.println(y);
}
