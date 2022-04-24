package ru.gb.java.almazbakiev;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(addingTwoNumbers(4, 11));
        positiveOrNegativeNumber(0);
        System.out.println(isNegative(5));
        printString(3, "Home work!");
        System.out.println(leapYear(2000));
    }

    // First task
    public static boolean addingTwoNumbers(int firstNumber, int secondNumber) {
        firstNumber += secondNumber;
        if (firstNumber >= 10 && firstNumber <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Second task
    public static void positiveOrNegativeNumber(int number) {
        if (number < 0) {
            System.out.println("Число отрицательное!");
        } else {
            System.out.println("Число положительное!");
        }
    }

    // Third task
    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Fourth task
    public static void printString(int iterationCounter, String text) {
        for (int i = 0; i < iterationCounter; i++) {
            System.out.println(text);
        }
    }

    // Fifth task
    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
