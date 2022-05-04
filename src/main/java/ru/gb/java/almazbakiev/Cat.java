package ru.gb.java.almazbakiev;

public class Cat extends Animal {

    private static int amountCat;

    public Cat(String name) {
        super(name);
        amountCat++;
    }

    public static int getAmountCat() {
        return amountCat;
    }

    public void run(int lengthObstacle) {
        final int RUN = 200;
        if (lengthObstacle > RUN) {
            System.out.println(getName() + " не может пробежать больше " + RUN + " м.");
        } else {
            System.out.println(getName() + " пробежал " + lengthObstacle + " м.");
        }
    }

    public void swim(int lengthObstacle) {
        System.out.println(getName() + " не умеет плавать.");
    }
}
