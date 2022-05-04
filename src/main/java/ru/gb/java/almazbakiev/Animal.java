package ru.gb.java.almazbakiev;

public abstract class Animal {
    private String name;
    private static int amountAnimal;

    public Animal(String name) {
        this.name = name;
        amountAnimal++;
    }

    public String getName() {
        return name;
    }

    public static int getAmountAnimal() {
        return amountAnimal;
    }

    public abstract void run(int lengthObstacle);

    public abstract void swim(int lengthObstacle);
}
