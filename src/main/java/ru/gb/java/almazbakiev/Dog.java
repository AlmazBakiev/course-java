package ru.gb.java.almazbakiev;

public class Dog extends Animal {

    private static int amountDog;

    public Dog(String name) {
        super(name);
        amountDog++;
    }

    public static int getAmountDog() {
        return amountDog;
    }

    public void run(int lengthObstacle) {
        final int RUN = 500;
        if (lengthObstacle > RUN) {
            System.out.println(getName() + " не может пробежать больше " + RUN + " м.");
        } else {
            System.out.println(getName() + " пробежал " + lengthObstacle + " м.");
        }
    }

    public void swim(int lengthObstacle) {
        final int SWIM = 10;
        if (lengthObstacle > SWIM) {
            System.out.println(getName() + " не может проплыть больше " + SWIM + " м.");
        } else {
            System.out.println(getName() + " проплыл " + lengthObstacle + " м.");
        }
    }
}
