package com.enigmacamp.fund;

public enum Direction {
    N, E, S, W;

    public Direction turnRight() {
        return Direction.values()[(this.ordinal()+1) % values().length];
    }

    public Direction turnLeft() {
        return Direction.values()[((this.ordinal()-1) + values().length) % values().length];
    }
}
