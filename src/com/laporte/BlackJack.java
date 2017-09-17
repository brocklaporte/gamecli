package com.laporte;

public class BlackJack extends CardGame {


    public BlackJack(){
        super();
    }

    // all the logic that defines blackjack as a unique
    // game should go in methods inside this class for encapsulation

    public void initGame(){
        super.initGame();
        System.out.println("In method " + this.getClass().getSimpleName() + ".initGame()");

        // start by shuffling the deck
        this.theDeck.shuffle();

        //
    }


    public boolean playGame(){
        boolean gameCompleted = super.playGame();

        System.out.println("In method BlackJack.playGame() - now we are playing the game!");

        // need to implement the proper game logic here and perhaps
        // in other methods within this class or supporting classes.

        // let's assume the game completed successfully
        gameCompleted = true;

        return gameCompleted;
    }

}
