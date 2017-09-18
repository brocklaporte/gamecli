package com.laporte;

public class CardGame extends Game {

    public CardDeck theDeck;

    public CardGame(){
        super();
    }

    public void initGame(){
        super.initGame();
        System.out.println("In method CardGame.initGame()");

        // do what we need to do to initialize all CardGames...
        // We always need an instance of a CardDeck
        // (we'll ignore games that require multiple card decks for now...)
        this.theDeck = new CardDeck();

        // nothing like a good shuffle to start a card game...
        this.theDeck.shuffle();

    }

    public boolean playGame(){
        boolean gameCompleted = super.playGame();

        System.out.println("In method CardGame.playGame()");

        return gameCompleted;
    }


}
