package ru.gb.java.almazbakiev;

// ������ �������
public class HomeWorkApp {
    public static void main(String[] args) {
        //������ �������
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //������ �������
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //������ �������
    public static void checkSumSign() {
        int a = 24;
        int b = 15;
        a += b;
        if (a >= 0) {
            System.out.println("����� �������������!");
        } else {
            System.out.println("����� �������������!");
        }
    }

    //��������� �������
    public static void printColor() {
        int value = 123;
        if (value <= 0) {
            System.out.println("�������");
        } else if (value > 0 && value <= 100) {
            System.out.println("������");
        } else if (value > 100) {
            System.out.println("�������");
        }
    }

    //����� �������
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