package com.company.groovy

class Player {
    String name
    private List<Card> cards = []
    private static final Random randomGenerator = new Random()

    public Player(String name) {
        this.name = name
    }

    public Card play() {
        return cards.remove(randomGenerator.nextInt(cards.size()))
    }

    public Card play(Type type) {
        Card find = cards.find { x -> (type == x.getType()) }
        if (find) {
            cards.remove(find)
        } else {
            find = play()
        }
        find
    }

    public hasCard = { ->
        cards
    }

    public void setCards(List<Card> cards) {
        this.cards = cards
    }

}
