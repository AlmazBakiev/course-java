package ru.gb.java.almazbakiev;

public class HomeWork6 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("������");
        Cat cat2 = new Cat("����");
        Cat cat3 = new Cat("�����");
        Dog dog1 = new Dog("�����");
        Dog dog2 = new Dog("������");
        Dog dog3 = new Dog("����");
        Dog dog4 = new Dog("����");

        cat1.run(150);
        cat1.swim(20);
        dog1.run(600);
        dog1.swim(5);

        System.out.println("����������� ��������� �����: " + Cat.getAmountCat() + ".");
        System.out.println("����������� ��������� �����: " + Dog.getAmountDog() + ".");
        System.out.println("����� ���������� ��������� ��������: " + Animal.getAmountAnimal() + ".");
    }
}
