package com.company.groovy


class Game {
    private CardDealer dealer
    private List<Player> players
    private Queue<Card> playedGame = [] as Queue


    Game(CardDealer dealer, List<Player> players) {
        this.dealer = dealer
        this.players = players
        Collections.shuffle(players, new Random(System.nanoTime()))
    }

    public startGame = { ->
        dealer.dealCards(players)
        while (true) {
            Player firstPlayer = players[0]
            if (!firstPlayer.hasCard()) {
                break
            }
            Card card = firstPlayer.play()
            playedGame.add(card)
            for (Player nextPlayer : players[1..3]) {
                playedGame.add(nextPlayer.play(card.getType()))
            }
        }
    }

    def printGame = { ->
        while (playedGame) {
            println "${playedGame.remove()} | ${playedGame.remove()} | ${playedGame.remove()} | ${playedGame.remove()} "

        }
    }
}