package buccaneer.java.cards;

import buccaneer.java.cards.enums.Crew;
import javafx.scene.image.Image;

import java.security.InvalidParameterException;

public class CrewCard extends Card {

    private final boolean isRed;
    private final boolean isBlack;


    public CrewCard(String name, int value, Image image, String cardColor) {
        super(name, value, image);

        //TODO make it more elegant
        //TODO add enum type to make code redable

        if (cardColor.equals(Crew.BLACK_CREW_CARD.getCrewCard())) {
            this.isBlack = true;
            this.isRed = false;
        } else if (cardColor.equals(Crew.RED_CREW_CARD.getCrewCard())) {
            this.isBlack = false;
            this.isRed = true;
        } else {

            throw new InvalidParameterException("Invalid card color.");
        }

    }

    public boolean isRed() {
        return isRed;
    }

    public boolean isBlack() {
        return isBlack;
    }
}
