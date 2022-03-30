package buccaneer.java.ports;

import buccaneer.java.cards.CardDeck;

public class Port {
    private final int positionX;
    private final int positionY;
    private final String name;


    public Port(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;

    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getName() {
        return name;
    }
}
