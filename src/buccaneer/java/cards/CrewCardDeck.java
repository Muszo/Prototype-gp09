package buccaneer.java.cards;

import buccaneer.java.cards.enums.Crew;
import buccaneer.java.cards.exeptions.CardNotInDeckException;
import buccaneer.java.cards.exeptions.EmptyDeckException;
import buccaneer.java.cards.exeptions.UpperDeckLimitReachedException;
import javafx.scene.image.Image;

import java.util.Stack;

public class CrewCardDeck implements Deck<Card> {

    private int maxCardsInDeck;
    private Stack<Card> deck;
    private int deckSize;

    public CrewCardDeck() {
        this.deck = new Stack<>();
        this.deckSize = 0;
        maxCardsInDeck = Integer.MAX_VALUE;
    }

    public CrewCardDeck(int maxCardsInDeck) {
        this.deck = new Stack<>();
        this.deckSize = 0;
        this.maxCardsInDeck = maxCardsInDeck;
    }

    @Override
    public void addCard(Card card) {
        if (deckSize < maxCardsInDeck) {
            deck.push(card);
            deckSize++;
        } else {
            throw new UpperDeckLimitReachedException("Deck limit exceeded.\n The deck limit is " + maxCardsInDeck);
        }
    }

    @Override
    public void addAllCards(Card[] cards) {
        if (cards.length + deckSize < maxCardsInDeck) {
            for (Card card : cards) {
                deck.push(card);
            }
        } else {
            throw new UpperDeckLimitReachedException("Deck limit exceeded.\n The deck limit is " + maxCardsInDeck);
        }
    }

    @Override
    public Card popCard(Card card) {
        if (deckSize > 0) {
            return deck.pop();
        } else {
            throw new EmptyDeckException("Deck is empty");
        }
    }

    @Override
    public void removeCard(Card card) {
        if (isCardInDeck(card)) {
            deck.remove(card);
        } else {
            throw new CardNotInDeckException("Card does not exist.");
        }
    }

    @Override
    public boolean isCardInDeck(Card card) {
        return deck.contains(card);

    }

    @Override
    public int getSize() {
        return deckSize;
    }
}
