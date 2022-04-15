package ru.gb.java.almazbakiev;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(addingTwoNumbers(9, 11));
        positiveOrNegativeNumber(0);
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

}
