package ru.gb.javaLvl2.almazbakiev;

public class Wall extends Obstacles {

    private int heightWall;
    private final String name = "Wall";

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getLengthOrHeightObstacle() {
        return heightWall;
    }
}


