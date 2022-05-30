package ru.gb.javaLvl2.almazbakiev;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random heightWall = new Random();
        Random lengthRunningTrack = new Random();

        AthleticSkills[] team = {
                new Cat("Лео"),
                new Human("Влад"),
                new Robot("Чаппи"),
        };

        Obstacles[] obstacles = {
                new RunningTrack(lengthRunningTrack.nextInt(301)),
                new Wall(heightWall.nextInt(5) + 1),
                new RunningTrack(lengthRunningTrack.nextInt(301)),
                new Wall(heightWall.nextInt(5) + 1),
                new RunningTrack(lengthRunningTrack.nextInt(301)),
                new Wall(heightWall.nextInt(5) + 1),
                new RunningTrack(lengthRunningTrack.nextInt(301)),
                new Wall(heightWall.nextInt(5) + 1),
        };

        for (AthleticSkills athleticSkills : team) {
            for (Obstacles o : obstacles) {
                if (o.getName().equals("Wall")) {
                    if (athleticSkills.jump(o.getLengthOrHeightObstacle())) {
                        break;
                    }
                } else {
                    if (athleticSkills.run(o.getLengthOrHeightObstacle())) {
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
