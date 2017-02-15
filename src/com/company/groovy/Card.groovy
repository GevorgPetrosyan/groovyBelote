package com.company.groovy

class Card {
    final Type type
    final CardValue cardValue

    Card(Type type, CardValue cardValue) {
        this.type = type
        this.cardValue = cardValue
    }

    @Override
    public String toString() {
        type.toString() + cardValue
    }
}
