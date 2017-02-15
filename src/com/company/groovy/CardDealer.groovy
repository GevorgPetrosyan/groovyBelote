package com.company.groovy


class CardDealer {
    CardDeck deck = new CardDeck()

    void dealCards(List<Player> players){
        Collections.shuffle(deck.getDeck(),new Random(System.nanoTime()))
        if (players.size()==4){
            for (Player player:players){
                player.setCards(deck.getEightCards())
            }
        }else {
            println "There should be 4 players in the game."
        }
    }
}
