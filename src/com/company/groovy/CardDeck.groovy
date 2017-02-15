package com.company.groovy

class CardDeck {
    private List<Card> deck = []

    CardDeck() {
        for (Type type : Type.values()) {
            for (CardValue value : CardValue.values()) {
                deck << new Card(type, value)
            }
        }
    }

    List<Card> getEightCards() {
        List<Card> cards = deck[size() - 8..size() - 1]
        deck.removeAll(cards)
        cards
    }

    def getDeck = { ->
        deck
    }

    int size() {
        deck.size()
    }
}
