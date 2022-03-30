package buccaneer.java.cards;

import buccaneer.java.cards.exeptions.CardNotInDeckException;
import buccaneer.java.cards.exeptions.EmptyDeckException;
import buccaneer.java.cards.exeptions.UpperDeckLimitReachedException;

import java.util.Stack;

public class CardDeck<Card> implements Deck<Card> {

    private final int maxCardsInDeck;
    private final Stack<Card> deck;
    private int currentDeckSize;

    public CardDeck() {
        this.deck = new Stack<>();
        this.currentDeckSize = 0;
        maxCardsInDeck = Integer.MAX_VALUE;
    }

    public CardDeck(int maxCardsInDeck) {
        this.deck = new Stack<>();
        this.currentDeckSize = 0;
        this.maxCardsInDeck = maxCardsInDeck;
    }

    @Override
    public void addCard(Card card) {
        if (currentDeckSize < maxCardsInDeck) {
            deck.push(card);
            currentDeckSize++;
        } else {
            throw new UpperDeckLimitReachedException("Deck limit exceeded.\n The deck limit is " + maxCardsInDeck);
        }
    }

    @Override
    public void addAllCards(Card[] cards) {
        if (cards.length + currentDeckSize < maxCardsInDeck) {
            for (Card card : cards) {
                currentDeckSize++;
                deck.push(card);
            }
        } else {
            throw new UpperDeckLimitReachedException("Deck limit exceeded.\n The deck limit is " + maxCardsInDeck);
        }
    }

    @Override
    public Card popCard() {
        if (currentDeckSize > 0) {
            currentDeckSize--;
            return deck.pop();
        } else {
            throw new EmptyDeckException("Deck is empty");
        }
    }

    @Override
    public void removeCard(Card card) {
        if (isCardInDeck(card)) {
            deck.remove(card);
            currentDeckSize--;
        } else {
            throw new CardNotInDeckException("Card does not exist.");
        }
    }


    @Override
    public Card extractCard(Card card) {
        if (isCardInDeck(card)) {
            deck.remove(card);
        }
        return card;
    }

    @Override
    public boolean isCardInDeck(Card card) {
        return deck.contains(card);

    }

    @Override
    public int getSize() {
        return currentDeckSize;
    }
}
