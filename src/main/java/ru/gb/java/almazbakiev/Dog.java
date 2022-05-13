package ru.gb.java.almazbakiev;

public class Dog extends Animal {

    private static int amountDog;
    final static int RUN_LIMIT = 500;
    final static int SWIM_LIMIT = 10;

    public Dog(String name, int appetite) {
        super(name, RUN_LIMIT, SWIM_LIMIT, appetite);
        amountDog++;
    }

    public static int getAmountDog() {
        return amountDog;
    }
}
