package ru.gb.java.almazbakiev;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amountFood) {
        if (amountFood <= food) {
            food -= amountFood;
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        System.out.println("В тарелке: " + food + " еды.");
    }

    public void addFood(int amountFood) {
        food += amountFood;
        System.out.print("Добавили еще " + amountFood + " еды.");
    }
}
