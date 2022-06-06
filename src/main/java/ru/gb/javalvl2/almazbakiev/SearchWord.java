package ru.gb.javalvl2.almazbakiev;

import java.util.*;

public class SearchWord {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(20);

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("one");
        words.add("six");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("two");
        words.add("eight");
        words.add("ten");
        words.add("nine");
        words.add("three");
        words.add("four");
        words.add("ten");
        words.add("seven");
        words.add("four");

        System.out.println("Изначальный список слов: " + words);
        Set<String> str = new LinkedHashSet<>(words);
        System.out.println("Вывод уникальных слов из списка: " + str);

        Map<String, Integer> countWord = new LinkedHashMap<>();
        for (String word : words) {
            countWord.put(word, countWord.getOrDefault(word, 0) + 1);
        }
        System.out.println("Вывод слов и их количества в списке: " + countWord + "\n");

        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "111111");
        phonebook.add("Иванов", "111111");
        phonebook.add("Сидоров", "222222");
        phonebook.add("Александров", "333333");
        phonebook.add("Иванин", "444444");
        phonebook.add("Петров", "555555");
        phonebook.add("Пупкин", "666666");
        phonebook.add("Масленников", "777777");
        phonebook.add("Петров", "555555");
        System.out.println(phonebook);
        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Масленников");
        phonebook.get("Сидоров");
    }
}