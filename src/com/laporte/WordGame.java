package com.laporte;

public class WordGame extends Game {


    public WordGame(){
        super();
    }

    public void initGame(){
        super.initGame();
        System.out.println("In method WordGame.initGame()");
    }

    public boolean playGame(){
        boolean gameCompleted = super.playGame();

        System.out.println("In method WordGame.playGame() - now we are playing the game!");

        // need to implement the proper game logic here and perhaps
        // in other methods within this class or supporting classes.

        // let's assume the game completed successfully
        gameCompleted = true;

        return gameCompleted;
    }


}
