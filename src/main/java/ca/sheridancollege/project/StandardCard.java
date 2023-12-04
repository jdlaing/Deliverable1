package ca.sheridancollege.project;

class StandardCard extends Card {

    StandardCard(String suit, String face) {
        this.suit = suit;
        this.face = face;

        this.value = switch(face) {
            case "Ace" -> 11; //TODO: 11 or 1
            case "King", "Queen", "Jack" -> 10;
            default -> Integer.parseInt(face);
        };
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
