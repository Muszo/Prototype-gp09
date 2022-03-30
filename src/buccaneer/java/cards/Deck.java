package buccaneer.java.cards;

public interface Deck<E> {

    void addCard(E card);

    void addAllCards(E[] cards);

    E popCard();

    void removeCard(E card);

    E extractCard(E card);

    boolean isCardInDeck(E card);

    int getSize();

}
