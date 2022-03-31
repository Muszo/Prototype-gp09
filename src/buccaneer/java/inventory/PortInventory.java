package buccaneer.java.inventory;

import buccaneer.java.cards.CardDeck;
import buccaneer.java.cards.CrewCard;
import buccaneer.java.cards.TreasureCard;
import buccaneer.java.cards.enums.Crew;

public class PortInventory {

    private CardDeck<CrewCard> crewDeck;
    private CardDeck<TreasureCard> treasureDeck;


    public PortInventory() {
        crewDeck = new CardDeck<>();
        treasureDeck = new CardDeck<>();
    }

    public CardDeck<CrewCard> getCrewDeck() {
        return crewDeck;
    }

    public CardDeck<TreasureCard> getTreasureDeck() {
        return treasureDeck;
    }

    public void addCrewCard(CrewCard card) {
        crewDeck.addCard(card);
    }

    public void addTreasureCard(TreasureCard card) {
        treasureDeck.addCard(card);
    }


    public CrewCard extractCrewCard(CrewCard card) {
        return crewDeck.extractCard(card);
    }

}
