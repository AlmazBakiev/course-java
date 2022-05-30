package ru.gb.javaLvl2.almazbakiev;

public class RunningTrack extends Obstacles {

    private int lengthRunningTrack;
    private final String name = "Running track";

    public RunningTrack(int lengthRunningTrack) {
        this.lengthRunningTrack = lengthRunningTrack;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getLengthOrHeightObstacle() {
        return lengthRunningTrack;
    }
}
