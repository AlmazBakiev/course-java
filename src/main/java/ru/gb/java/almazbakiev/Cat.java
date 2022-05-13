package ru.gb.java.almazbakiev;

public class Cat extends Animal {

    private static int amountCat;
    private static final int RUN_LIMIT = 200;
    private static final int SWIM_LIMIT = 0;

    public Cat(String name, int appetite) {
        super(name, RUN_LIMIT, SWIM_LIMIT, appetite);
        amountCat++;
    }

    public static int getAmountCat() {
        return amountCat;
    }

    public void swim(int lengthObstacle) {
        System.out.println(getName() + " не умеет плавать.");
    }
}
