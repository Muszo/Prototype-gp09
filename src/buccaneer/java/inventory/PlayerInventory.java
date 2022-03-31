package buccaneer.java.inventory;

import buccaneer.java.cards.CrewCard;
import buccaneer.java.cards.TreasureCard;

public interface PlayerInventory {

    void storeTreasure(TreasureCard treasureCard);

    void storeCrew(CrewCard crewCard);

    //needs chanceCard param
    void storeUniqueChanceCard();

    CrewCard extractCrewCard();

    TreasureCard extractTreasureCard();


}