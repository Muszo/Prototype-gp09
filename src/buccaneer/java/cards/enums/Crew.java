package buccaneer.java.cards.enums;

public enum Crew {

    RED_CREW_CARD("RED_CREW_CARD"),
    BLACK_CREW_CARD("BLACK_CREW_CARD");

    private final String crewCard;

    Crew(String crewCard) {
        this.crewCard = crewCard;
    }

    public String getCrewCard() {
        return crewCard;
    }

}
