package com.laporte;

public class Main {

    public static void main(String[] args) {

        boolean gameCompletedSuccessfully = false;

        // You could start by asking the user here what kind of game they want to play,
        // and then instantiate the right subclass of Game to let the user play it.
        // then all of the variables and logic needed to support each Game subclass are
        // contained only in the files relevant to that particular game.


        // -------------------- Start by playing BlackJack --------------------------

        // instantiate BlackJack CardGame
        Game myGame = new BlackJack();
        gameCompletedSuccessfully = myGame.runGame();

        // -------------------- Play a different game --------------------------

        // Now a game of Five Card Stud.
        // Due to polymorphism, we can use the same myGame local variable
        // which is of type Game, even though we're assigning a subclass of
        // Game called FiveCardStud (and BlackJack above, and other Game subclasses below).
        myGame = new FiveCardStud();
        gameCompletedSuccessfully = myGame.runGame();

        // -------------------- Play a different game --------------------------

        // Now a game of WordGame - the subclass of Game does not need to be a subclass of CardGame
        // so can be a completely different type of game...
        myGame = new WordGame();
        gameCompletedSuccessfully = myGame.runGame();

        // -------------------- Play a different game --------------------------

        // Now a game of TickTackToe.
        myGame = new TickTackToe();
        gameCompletedSuccessfully = myGame.runGame();


    }

}
