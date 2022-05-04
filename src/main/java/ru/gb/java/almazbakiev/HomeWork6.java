package ru.gb.java.almazbakiev;

public class HomeWork6 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мася");
        Cat cat3 = new Cat("Белла");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Дружок");
        Dog dog3 = new Dog("Марс");
        Dog dog4 = new Dog("Леон");

        cat1.run(150);
        cat1.swim(20);
        dog1.run(600);
        dog1.swim(5);

        System.out.println("Колличество созданных котов: " + Cat.getAmountCat() + ".");
        System.out.println("Колличество созданных собак: " + Dog.getAmountDog() + ".");
        System.out.println("Общее количество созданных животных: " + Animal.getAmountAnimal() + ".");
    }
}
