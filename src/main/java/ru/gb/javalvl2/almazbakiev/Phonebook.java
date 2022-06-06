package ru.gb.javalvl2.almazbakiev;

import java.util.TreeMap;

public class Phonebook {

    static TreeMap<String, String> book = new TreeMap<>();

    public void add(String lastName, String number) {
        book.put(lastName, book.getOrDefault(lastName, "") + " " + number);
    }

    public void get(String key) {
        System.out.println("Номер телефона " + key + ": " + book.get(key));
    }

    @Override
    public String toString() {
        return "" + book.entrySet();
    }
}
