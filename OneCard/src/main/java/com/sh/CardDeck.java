package com.sh;

import com.sh.objectType.card.Card;

import java.util.*;

public class CardDeck {
    List<Card> cardDeck =  new ArrayList<>();


    public CardDeck() {
    }

    public CardDeck(List<Card> cardDeck, Random rand) {
        this.cardDeck = cardDeck;

    }

    public void addCard(Card card) {
        cardDeck.add(card);

    }
    public Card removeCard(int index) {
        return cardDeck.remove(index);
    }
    public boolean removeCard(Card card) {

        return cardDeck.remove(card);
    }
    public Card getCard(int index) {
        return cardDeck.get(index);
    }
    public List<Card> mergeDeck(CardDeck cardDeck) {
        this.cardDeck.addAll(cardDeck.getCardDeck());
        this.shuffle();
        return this.cardDeck;
    }
    public void shuffle() {
        Collections.shuffle(cardDeck);
    }
    public Card getTopCard() {
        if(!cardDeck.isEmpty())
            return cardDeck.get(cardDeck.size() - 1);
        else return null;
    }
    public void printDeque() {
        System.out.println(this.cardDeck);
    }

    public List<Card> getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(List<Card> cardDeck) {
        this.cardDeck = cardDeck;
    }

    public int getLength() {
        return cardDeck.size();
    }

}
