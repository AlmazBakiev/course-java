package ru.gb.java.almazbakiev;

import java.util.*;
import java.util.stream.Collectors;

public class Phonebook {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();

        addLine(phonebook, "Ivanov", "23512");
        addLine(phonebook, "Fedorov", "23512");
        addLine(phonebook, "Ivanov", "23232");
        addLine(phonebook, "Aleksandrov", "33562");
        addLine(phonebook, "Ivanov", "33512");

        List list = new ArrayList(phonebook.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> a, Map.Entry<String, String> b) {
                return b.getValue().length() - a.getValue().length();
            }
        });
        System.out.println(list);
    }

    private static void addLine(Map<String, String> phonebook, String name, String number) {
        String resultNumber = phonebook.get(name);
        if (resultNumber != null && !resultNumber.equals(number)) {
            resultNumber = resultNumber + ", " + number;
            phonebook.put(name, resultNumber);
        } else {
            phonebook.put(name, number);
        }
    }
}