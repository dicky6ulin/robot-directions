package com.enigmacamp.test;

import com.enigmacamp.fund.Direction;
import org.junit.Test;
import static org.junit.Assert.*;

public class DirectionTest {

    @Test
    public void turnRight_should_returnNorth_when_currency_West(){
        Direction currentDirection = Direction.W;
        Direction expectedDirection = Direction.N;
        Direction direction = currentDirection.turnRight();
        assertEquals(direction, expectedDirection);
    }

    @Test
    public void turnRight_should_returnEast_when_currency_North(){
        Direction currentDirection = Direction.N;
        Direction expectedDirection = Direction.E;
        Direction direction = currentDirection.turnRight();
        assertEquals(direction, expectedDirection);
    }

    @Test
    public void turnRight_should_returnSouth_when_currency_East(){
        Direction currentDirection = Direction.E;
        Direction expectedDirection = Direction.S;
        Direction direction = currentDirection.turnRight();
        assertEquals(direction, expectedDirection);
    }

    @Test
    public void turnRight_should_returnWest_when_currency_South(){
        Direction currentDirection = Direction.S;
        Direction expectedDirection = Direction.W;
        Direction direction = currentDirection.turnRight();
        assertEquals(direction, expectedDirection);
    }

    //=========

    @Test
    public void turnLeft_should_returnNorth_when_currency_East(){
        Direction currentDirection = Direction.E;
        Direction expectedDirection = Direction.N;
        Direction direction = currentDirection.turnLeft();
        assertEquals(direction, expectedDirection);
    }

    @Test
    public void turnLeft_should_returnEast_when_currency_South(){
        Direction currentDirection = Direction.S;
        Direction expectedDirection = Direction.E;
        Direction direction = currentDirection.turnLeft();
        assertEquals(direction, expectedDirection);
    }

    @Test
    public void turnLeft_should_returnSouth_when_currency_West(){
        Direction currentDirection = Direction.W;
        Direction expectedDirection = Direction.S;
        Direction direction = currentDirection.turnLeft();
        assertEquals(direction, expectedDirection);
    }

    @Test
    public void turnLeft_should_returnWest_when_currency_North(){
        Direction currentDirection = Direction.N;
        Direction expectedDirection = Direction.W;
        Direction direction = currentDirection.turnLeft();
        assertEquals(direction, expectedDirection);
    }
}
