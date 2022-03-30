package buccaneer.java.cards;

public interface Deck<E> {

    void addCard(E card);

    void addAllCards(E[] cards);

    E popCard(E card);

    void removeCard(E card);

    boolean isCardInDeck(E card);

    int getSize();

}
