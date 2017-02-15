package com.company.groovy

class GroovyMain {
    public static void main(String[] args) {
        List players = [new Player("Mark"), new Player("John"), new Player("Smith"), new Player("Patrick")]
        Game game = new Game(new CardDealer(), players)
        game.startGame()
        game.printGame()
    }

}
