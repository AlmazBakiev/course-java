package ru.gb.java.almazbakiev;

public class HomeWork6 {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("���", 30),
                new Cat("����", 27),
                new Cat("����", 22),
                new Cat("����", 25),
                new Dog("����", 73),
                new Dog("������", 90),
                new Dog("�����", 100)
        };

        Plate plateForAllAnimals = new Plate(200);
        for (Animal animal : animals) {
            animal.eat(plateForAllAnimals);
            plateForAllAnimals.info();
        }

        plateForAllAnimals.addFood(100);
        plateForAllAnimals.info();

        System.out.println("����������� ��������� �����: " + Cat.getAmountCat() + ".");
        System.out.println("����������� ��������� �����: " + Dog.getAmountDog() + ".");
        System.out.println("����� ���������� ��������� ��������: " + Animal.getAmountAnimal() + ".");
    }
}
