package ru.gb.javalvl2.almazbakiev;

public class App {
    public static void main(String[] args) {

        CreateArray array = new CreateArray(4, 4);

        try {
            array.checkArray(array.initialArray());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}