package com.tatyushevms.helpertohelen;

public class Result {
    
    private final int spent;
    private final int bought;
    private final boolean traversed;
    
    public Result(int spent, int bought, boolean traversed) {
        this.spent = spent;
        this.bought = bought;
        this.traversed = traversed;
    }
    
    public int getSpent() {
        return spent;
    }
    
    public int getBought() {
        return bought;
    }
    
    public boolean isTraversed() {
        return traversed;
    }
    
}
