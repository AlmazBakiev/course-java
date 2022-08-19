package ru.gb.javalvl3.almazbakiev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5};
        String[] strArr = new String[]{"a", "b", "c", "d", "e"};
        Integer[] integers = swapElements(intArr, 1, 3);
        String[] strings = swapElements(strArr, 0, 4);
        List<Integer> listInteger = transformArrayToArrayList(integers);
        List<String> listString = transformArrayToArrayList(strings);

        System.out.println(listInteger);
        System.out.println(listString);
        System.out.println("---------------");

        Box<Apple> boxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();
        Box<GoldenApple> goldenAppleBox = new Box<>();

        boxApple.add(new Apple(), new Apple(), new Apple(), new Apple());
        boxOrange.add(new Orange(), new Orange(), new Orange(), new Orange());
        goldenAppleBox.add(new GoldenApple(), new GoldenApple(), new GoldenApple(), new GoldenApple(), new GoldenApple());

        System.out.println("Apple");
        System.out.println("Amount: " + boxApple.getAmount());
        System.out.println("Weight " + boxApple.getWeight());
        System.out.println("---------------");

        System.out.println("Orange");
        System.out.println("Amount: " + boxOrange.getAmount());
        System.out.println("Weight " + boxOrange.getWeight());
        System.out.println("---------------");

        System.out.println("Golden Apple");
        System.out.println("Amount: " + goldenAppleBox.getAmount());
        System.out.println("Weight " + goldenAppleBox.getWeight());
        System.out.println("---------------");

        System.out.println("BoxApple compare GoldenAppleBox = " + boxApple.compare(goldenAppleBox));
        System.out.println("BoxApple compare BoxOrange = " + boxApple.compare(boxOrange));
        System.out.println();


        Box<Orange> orangeBox = new Box<>();
        System.out.println("boxOrange.getAmount() = " + boxOrange.getAmount());
        System.out.println("orangeBox.getAmount() = " + orangeBox.getAmount());
        System.out.println("---------------");
        boxOrange.transfer(orangeBox);
        System.out.println("boxOrange.getAmount() = " + boxOrange.getAmount());
        System.out.println("orangeBox.getAmount() = " + orangeBox.getAmount());
        System.out.println();

        Box<Apple> appleBox = new Box<>();
        System.out.println("goldenAppleBox.getAmount() = " + goldenAppleBox.getAmount());
        System.out.println("appleBox.getAmount() = " + appleBox.getAmount());
        System.out.println("---------------");
        goldenAppleBox.transfer(appleBox);
        System.out.println("goldenAppleBox.getAmount() = " + goldenAppleBox.getAmount());
        System.out.println("appleBox.getAmount() = " + appleBox.getAmount());
    }

    public static <T> T[] swapElements(T[] array, int firstIndex, int secondIndex) {
        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        return array;
    }

    public static <T> ArrayList<T> transformArrayToArrayList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
