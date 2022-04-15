package ru.gb.java.almazbakiev;

// Первое задание
public class HomeWorkApp {
    public static void main(String[] args) {
        //Шестое задание
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //Второе задание
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Третье задание
    public static void checkSumSign() {
        int a = 24;
        int b = 15;
        a += b;
        if (a >= 0) {
            System.out.println("Сумма положительная!");
        } else {
            System.out.println("Сумма отрицательная!");
        }
    }

    //Четвертое задание
    public static void printColor() {
        int value = 123;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //Пятое задание
    public static void compareNumbers() {
        int a, b;
        a = 100;
        b = 150;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}