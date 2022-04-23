package ru.gb.java.almazbakiev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        indents(1);
        arrayInitializationAndInversion();
        indents(2);
        arrayOfValues();
        indents(3);
        multiplicationOfNumbers();
        indents(4);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину квадратного двумерного целочисленного массива: ");
        int value = sc.nextInt();
        squareArray(value);
        indents(5);
        System.out.println(Arrays.toString(returnArray(10, 2)));
        indents(6);
        maximumAndMinimumValue();
        indents(7);
        int[] arr = new int[]{
                1, 5, 1, 2, 6, 11, -1, 8, 9, 10, 2, 1, -3
        };
        System.out.println(equalityTest(arr));
        indents(8);
        System.out.print("Введите число для смещение элементов массива: ");
        int shift = sc.nextInt();
        sc.close();
        indexOffset(arr, shift);
    }

    //first
    public static void arrayInitializationAndInversion() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(2);
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
    }

    //second
    public static void arrayOfValues() {
        int[] arr = new int[100];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ++x;
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
    }

    //third
    public static void multiplicationOfNumbers() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
    }

    //fourth
    public static void squareArray(int value) {
        int[][] arr = new int[value][value];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //fifth
    public static int[] returnArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    //sixth
    public static void maximumAndMinimumValue() {
        int[] arr = new int[30];
        int max = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(101) - 50;
            System.out.print(arr[i] + "; ");
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Минимальное число: " + min + ". Максимальное число: " + max + ".");
    }

    //seventh
    public static boolean equalityTest(int[] arr) {
        int leftSide = 0, rightSide = 0;
        int index;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите границу(индекс) массива между правой и левой сторонами: ");
            index = sc.nextInt();
            if (index >= 0 && index < arr.length) {
                break;
            }
        }
        for (int i = 0; i < index; i++) {
            leftSide += arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            rightSide += arr[i];
        }
        System.out.println("Левая сторона: " + leftSide);
        System.out.println("Правая сторона: " + rightSide);
        return leftSide == rightSide;
    }

    //eighth
    public static void indexOffset(int[] arr, int shift) {
        shift %= arr.length;                                //остаток от деления сдвига на длину массива
        System.out.println(Arrays.toString(arr));
        if (shift < 0) {
            int a = arr.length - 1;
            for (int j = 0; j > shift; j--) {               //колличество сдвигов
                for (int i = arr.length; i >= 0; i--) {     //прохождение по элементам массива с конца
                    if (i == 0) {
                        arr[arr.length - 1] = a;            //сдвиг первого элемента в конец массива
                    } else {
                        a = a + arr[i - 1];                 //сдвиг
                        arr[i - 1] = a - arr[i - 1];        //на один элемент
                        a = a - arr[i - 1];                 //влево
                    }
                }
            }
        } else if (shift > 0) {
            int a = arr[0];
            for (int j = 0; j < shift; j++) {
                for (int i = 0; i < arr.length; i++) {
                    if (i == arr.length - 1) {
                        arr[0] = a;                         //сдвиг последнего элемента в начало
                    } else {
                        a = a + arr[i + 1];                 //сдвиг
                        arr[i + 1] = a - arr[i + 1];        //на один элемент
                        a = a - arr[i + 1];                 //вправо
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void indents(int number) {
        System.out.println();
        System.out.println(number + " задание:");
    }
}