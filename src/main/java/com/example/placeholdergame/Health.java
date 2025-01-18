package com.example.placeholdergame;

public class Health {
    private static Health instance = new Health(); // Singleton instance
    private int health = 100; // Starting health value

    private Health() {} // Private constructor to enforce singleton pattern

    public static Health getInstance() {
        return instance;
    }

    public void loseHealth(int amount) {
        if (amount > 0) { // Ensure only positive values are subtracted
            health -= amount;
            if (health < 0) { // Ensure health doesn't drop below zero
                health = 0;
            }
        }
    }

    public int getHealth() {
        return health;
    }
}