package ru.gb.javaLvl2.almazbakiev;

public class Human implements AthleticSkills {

    private final int LIMITE_RUN = 200;
    private final int LIMITE_JUMP = 2;
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(int length) {
        if (length <= LIMITE_RUN) {
            System.out.println("Человек " + getName() + " пробежал дистанцию до препятствия");
            return false;
        } else {
            System.out.println("Человек " + getName() + " не смог пробежать больше " + LIMITE_RUN + "м и продолжить не смог");
        }
        return true;
    }

    @Override
    public boolean jump(int length) {
        if (length <= LIMITE_JUMP) {
            System.out.println("Человек " + getName() + " перепрыгнул препятствие и побежал дальше");
            return false;
        } else {
            System.out.println("Человек " + getName() + " не преодолел препятствие и продолжить не смог");
        }
        return true;
    }
}
