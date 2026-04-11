void main() {
    verse1();
    IO.println();

    verse2();
    IO.println();

    verse3();
    IO.println();

    verse4();
    IO.println();

    verse5();
    IO.println();

    verse6();
    IO.println();

    verse7();
}

//Strophen

void verse1() {
    IO.println("This is the house that Jack built.");
}

void verse2() {
    IO.println("This is the malt");
    lineHouse();
}

void verse3() {
    IO.println("This is the rat");
    lineMalt();
}

void verse4() {
    IO.println("This is the cat");
    lineRat();
}

void verse5() {
    IO.println("This is the dog");
    lineCat();
}

void verse6() {
    IO.println("This is the cow with the crumpled horn");
    lineDog();
}

void verse7() {
    IO.println("This is the maiden all forlorn");
    lineCow();
}

//Zeilen

void lineHouse() {
    IO.println("That lay in the house that Jack built.");
}

void lineMalt() {
    IO.println("That ate the malt");
    lineHouse();
}

void lineRat() {
    IO.println("That killed the rat");
    lineMalt();
}

void lineCat() {
    IO.println("That worried the cat");
    lineRat();
}

void lineDog() {
    IO.println("That tossed the dog");
    lineCat();
}

void lineCow() {
    IO.println("That milked the cow with the crumpled horn");
    lineDog();
}
