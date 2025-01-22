package com.example.placeholdergame;

public class Opponent {
    private static Opponent instance = new Opponent(); // Singleton instance
    private int opponenthealth = 100; // Starting health value

    private Opponent() {} // Private constructor to enforce singleton pattern

    public static Opponent getInstance() {
        return instance;
    }

    public void loseOpponentHealth(int amount) {
        if (amount > 0) { // Ensure only positive values are subtracted
            opponenthealth -= amount;
            if (opponenthealth < 0) { // Ensure health doesn't drop below zero
                opponenthealth = 0;
            }
        }
    }

    public int getOpponent() {
        return opponenthealth;
    }
}