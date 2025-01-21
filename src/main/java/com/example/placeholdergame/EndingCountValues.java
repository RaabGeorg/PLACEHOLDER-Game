package com.example.placeholdergame;

public class EndingCountValues {
    private static final EndingCountValues instance = new EndingCountValues();
    //counter variables
    public int good;
    public int bad;
    public int neutral;
    //boolean for spaceship event
    public boolean energyCore;

    //Constructor
    public EndingCountValues() {
        this.good = 0;
        this.bad = 0;
        this.neutral = 0;
        this.energyCore = false;
    }

    //getter for instance
    public static EndingCountValues getInstance() {
        return instance;
    }
}
