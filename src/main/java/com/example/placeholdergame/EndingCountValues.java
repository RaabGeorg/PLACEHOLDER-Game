package com.example.placeholdergame;

public class EndingCountValues {
    private static final EndingCountValues instance = new EndingCountValues();
    public int good;
    public int bad;
    public int neutral;
    public boolean energyCore;

    public EndingCountValues() {
        this.good = 0;
        this.bad = 0;
        this.neutral = 0;
        this.energyCore = false;
    }

    public static EndingCountValues getInstance() {
        return instance;
    }
}
