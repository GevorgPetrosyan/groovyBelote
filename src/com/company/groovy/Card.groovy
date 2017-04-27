package com.company.groovy

import groovy.transform.ToString

@ToString(includePackage = false)
class Card {
    final Type type
    final CardValue cardValue

    Card(Type type, CardValue cardValue) {
        this.type = type
        this.cardValue = cardValue

        
    }

}
