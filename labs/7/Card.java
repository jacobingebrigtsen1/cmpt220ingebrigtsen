class Card {
private String face, suit;
public Card(String f, String s) {
face = f;
suit = s;
}

public String getFace() {
return face;
}

public void setFace(String face) {
this.face = face;
}

public String getSuit() {
	return suit;
}

public void setSuit(String suit) {
this.suit = suit;
}

@Override

public String toString() {
	return face + " of " + suit;
}

}

