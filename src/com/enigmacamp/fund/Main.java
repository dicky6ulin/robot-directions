package com.enigmacamp.fund;

public class Main {

    public static void main(String[] args) {

        try {

            Robot robot = new Robot();
            robot.readData();

            Direction direction = (Direction) Direction.valueOf(robot.newDirection);
            Position position = new Position(robot.coordinateX, robot.coordinateY);
            Robot robot1 = new Robot(position, direction);
            robot1.moves("LAAARAAA");

        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
