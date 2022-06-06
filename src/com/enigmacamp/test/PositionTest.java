package com.enigmacamp.test;

import com.enigmacamp.fund.Position;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {

    @Test
    public void getRight_getPosition_X3_Y3_when_starting_position_X2_Y3(){
        Position currentPosition = new Position(2, 3);
        Position expectedPosition = new Position(3, 3);
        Position position = currentPosition.getRight();
        assertEquals(position, expectedPosition);
    }

    @Test
    public void getLeft_getPosition_X1_Y3_when_starting_position_X2_Y3(){
        Position currentPosition = new Position(2, 3);
        Position expectedPosition = new Position(1, 3);
        Position position = currentPosition.getLeft();
        assertEquals(position, expectedPosition);
    }

    @Test
    public void getTop_getPosition_X1_Y4_when_starting_position_X2_Y3(){
        Position currentPosition = new Position(2, 3);
        Position expectedPosition = new Position(2, 4);
        Position position = currentPosition.getTop();
        assertEquals(position, expectedPosition);
    }

    @Test
    public void getCollum_getPosition_X1_Y2_when_starting_position_X2_Y3(){
        Position currentPosition = new Position(2, 3);
        Position expectedPosition = new Position(2, 2);
        Position position = currentPosition.getCollum();
        assertEquals(position, expectedPosition);
    }
}
