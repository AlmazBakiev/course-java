package ru.gb.java.almazbakiev;

public abstract class Animal {
    private final String name;
    private static int amountAnimal;
    private final int runLimit;
    private final int swimLimit;
    private final int appetite;
    private boolean satiety = false;

    public Animal(String name, int runLimit, int swimLimit, int appetite) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.appetite = appetite;
        amountAnimal++;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public static int getAmountAnimal() {
        return amountAnimal;
    }

    public void run(int lengthObstacle) {
        if (lengthObstacle > runLimit) {
            System.out.println(getName() + " �� ����� ��������� ������ " + runLimit + " �.");
        } else {
            System.out.println(getName() + " �������� " + lengthObstacle + " �.");
        }
    }

    public void swim(int lengthObstacle) {
        if (lengthObstacle > swimLimit) {
            System.out.println(getName() + " �� ����� �������� ������ " + swimLimit + " �.");
        } else {
            System.out.println(getName() + " ������� " + lengthObstacle + " �.");
        }
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            System.out.println(getName() + " ������!");
        } else {
            System.out.println(getName() + " �� ����.");
        }
    }
}
