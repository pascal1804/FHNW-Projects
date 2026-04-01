class Kontrollfluss {
	void main() {
		IO.println(maximum(17, 42));
		IO.println(maximum(0, -4));
		IO.println(maximum(3, 3));
	}

	int maximum(int a, int b) {
    		if (a > b) {
        		return a;
    		} else {
    			return b;
		}
	}
}
