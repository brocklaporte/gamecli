package com.laporte;

public class CardGame extends Game {

    public CardDeck theDeck;

    public CardGame(){
        super();

        // since this is a card game, we know we
        // always need an instance of a CardDeck
        this.theDeck = new CardDeck();
    }

    public void initGame(){
        super.initGame();
        System.out.println("In method CardGame.initGame()");
    }

    public boolean playGame(){
        boolean gameCompleted = super.playGame();

        System.out.println("In method CardGame.playGame()");

        return gameCompleted;
    }


}
