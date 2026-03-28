void main() { //1.Syntaxfehler: die geschweifte Klammer fehlte
    // Berechnet die Summe der Zahlen von 1 bis 10
    double sum = 0.0; //2. Typfehler: int anstatt double / falscher Wert für int.
    for (int i = 1; i < 11; i++) { // 3. Syntaxfehler , anstatt ;
        sum += i; //4. Syntaxfehler: + und = vertauscht
    }			//5. Logikfehler: Die for Schleife müsste bis 11 gehen.
    IO.println(sum);
}

