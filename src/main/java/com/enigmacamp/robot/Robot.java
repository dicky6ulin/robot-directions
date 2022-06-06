package com.enigmacamp.robot;

import com.enigmacamp.robot.lib.Direction;
import com.enigmacamp.robot.lib.Position;

import java.io.*;
import java.io.File;

public class Robot {

    private Position position;
    private Direction direction;
    public String newDirection;
    public Integer coordinateX;
    public Integer coordinateY;

    public Robot(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public Robot() {
    }

    public void moves(String commands) throws IOException {
        String[] commandArr = commands.split("");

        for (String command : commandArr) {
            move(command);

            String root = toString();
            saveData(root);

            System.out.println(this.toString());
        }
    }

    public File createPath() {

        String path = "C:\\Dev\\Java\\EnigmaCamp\\day18-Maven\\Robot\\file_backup\\dataRobot.txt";
        File file = new File(path);
        return file;
    }

    public void saveData(String dataMoveRobot) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(createPath(), true));
        bufferedWriter.write(dataMoveRobot);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public void readData() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(createPath()));

        String newPath = "";
        while (true) {
            String text = bufferedReader.readLine();
            if (text == null) break;
            newPath = text;
        }

        String[] arrText = newPath.split(" ");

        this.newDirection = arrText[0];
        this.coordinateX = Integer.parseInt(arrText[1]);
        this.coordinateY = Integer.parseInt(arrText[2]);
    }

    public void move(String stringCommand) {
        Command command = Command.valueOf(stringCommand);
        switch (command) {
            case A:
                forward();
                break;
            case R:
                direction = direction.turnRight();
                break;
            case L:
                direction = direction.turnLeft();
                break;
        }
    }

    private void forward() {
        if (this.direction == Direction.E) {
            position = position.getRight();
        }
        if (this.direction == Direction.N) {
            position = position.getTop();
        }
        if (this.direction == Direction.W) {
            position = position.getLeft();
        }
        if (this.direction == Direction.S) {
            position = position.getCollum();
        }
    }

    @Override
    public String toString() {
        return direction + " " + position;
    }
}