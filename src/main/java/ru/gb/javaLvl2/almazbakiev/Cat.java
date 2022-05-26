package ru.gb.javaLvl2.almazbakiev;

public class Cat implements AthleticSkills {

    private final int LIMITE_RUN = 150;
    private final int LIMITE_JUMP = 3;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(int length) {
        if (length <= LIMITE_RUN) {
            System.out.println(" от " + getName() + " пробежал дистанцию до преп€тстви€");
            return false;
        } else {
            System.out.println(" от " + getName() + " не смог пробежать больше " + LIMITE_RUN + "м и продолжить не смог");
        }
        return true;
    }

    @Override
    public boolean jump(int length) {
        if (length <= LIMITE_JUMP) {
            System.out.println(" от " + getName() + " перепрыгнул преп€тствие и побежал дальше");
            return false;
        } else {
            System.out.println(" от " + getName() + " не преодолел преп€тствие и продолжить не смог");
        }
        return true;
    }
}
