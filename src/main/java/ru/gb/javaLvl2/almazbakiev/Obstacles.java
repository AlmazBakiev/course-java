package ru.gb.javaLvl2.almazbakiev;

public abstract class Obstacles {
    private String name;

    public String getName() {
        return name;
    }

    public abstract int getLengthOrHeightObstacle();
}
