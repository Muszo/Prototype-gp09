package buccaneer.java.cards.enums;

public enum Treasure {
    DIAMONDS("DIAMOND", 5),
    RUBIES("RUBY", 5),
    GOLD_BARS("GOLD_BARS", 4),
    PEARLS("PEARLS", 3),
    BARRELS_OF_RUM("BARRELS_OF_RUM", 2);

    private final String typeOfTreasure;
    private final int valueOfTreasure;

    Treasure(String typeOfTreasure, int valueOfTreasure) {
        this.typeOfTreasure = typeOfTreasure;
        this.valueOfTreasure = valueOfTreasure;
    }

    public String getTypeOfTreasure() {
        return typeOfTreasure;
    }

    public int getValueOfTreasure() {
        return valueOfTreasure;
    }
}
