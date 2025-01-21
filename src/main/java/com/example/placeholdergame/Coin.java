package com.example.placeholdergame;

public class Coin {
    private static Coin instance = new Coin(); // Singleton instance
    private int coinCount = 0;

    private Coin() {} // Private constructor to enforce singleton pattern

    public static Coin getInstance() {
        return instance;
    }

    public void addCoins(int amount) {
        if (amount > 0) { // Ensure only positive values are added
            coinCount += amount;
        }
    }

    public int getCoinCount() {
        return coinCount;
    }
    public void setCoinCount(int amount) {
        if (amount >= 0) { // Ensure the coin count is not negative
            coinCount = amount;
        }
    }
}
