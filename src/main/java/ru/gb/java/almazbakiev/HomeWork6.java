package ru.gb.java.almazbakiev;

public class HomeWork6 {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Лео", 30),
                new Cat("Лиса", 27),
                new Cat("Луна", 22),
                new Cat("Мася", 25),
                new Dog("Лаки", 73),
                new Dog("Дружок", 90),
                new Dog("Шарик", 100)
        };

        Plate plateForAllAnimals = new Plate(200);
        for (Animal animal : animals) {
            animal.eat(plateForAllAnimals);
            plateForAllAnimals.info();
        }

        plateForAllAnimals.addFood(100);
        plateForAllAnimals.info();

        System.out.println("Колличество созданных котов: " + Cat.getAmountCat() + ".");
        System.out.println("Колличество созданных собак: " + Dog.getAmountDog() + ".");
        System.out.println("Общее количество созданных животных: " + Animal.getAmountAnimal() + ".");
    }
}
