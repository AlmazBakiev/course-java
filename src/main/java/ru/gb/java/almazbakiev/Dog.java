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
            System.out.println(getName() + " �� ����� ��������� ������ " + RUN + " �.");
        } else {
            System.out.println(getName() + " �������� " + lengthObstacle + " �.");
        }
    }

    public void swim(int lengthObstacle) {
        final int SWIM = 10;
        if (lengthObstacle > SWIM) {
            System.out.println(getName() + " �� ����� �������� ������ " + SWIM + " �.");
        } else {
            System.out.println(getName() + " ������� " + lengthObstacle + " �.");
        }
    }
}
