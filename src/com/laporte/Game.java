package com.laporte;

public class Game {

    String gameName;

    public Game(){
            // get the original Game subclass name
            this.setGameName(this.getClass().getSimpleName());
            System.out.println("We have created a " + this.getGameName() + " object, which is a subclass of Game.");
        }

    public String getGameName(){
        return this.gameName;
    }

    public void setGameName(String name){
        this.gameName = name;
    }


    public boolean runGame(){
        // let's make "true" mean the game completed
        // successfully and false mean the game was
        // aborted for some reason.

        boolean gameResult = false; // did the game complete?

        // every game needs to have a chance to set things up like card deck, players etc.
        // This is what init() will be for.
        this.initGame();

        // now play the game and return the result
        gameResult = this.playGame();

        if (gameResult){
            System.out.println("Game " + this.getGameName() + " completed successfully.");
        } else {
            System.out.println("Uh oh - Game " + this.getGameName() + " was aborted!");
        }

        // for output readability...
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("");

        return gameResult;

    }

    public void initGame(){
        // base class
        System.out.println("In method Game.initGame()");
    }

    public boolean playGame(){
        boolean gameCompleted = false;

        // base class, so no call to super()

        System.out.println("In method Game.playGame()");

        return gameCompleted;
    }
}
