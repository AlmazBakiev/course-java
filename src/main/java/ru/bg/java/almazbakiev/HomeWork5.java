package ru.bg.java.almazbakiev;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] personArray = new Employee[5];
        personArray[0] = new Employee("������ ���� ��������", "�������", "ivan@i.com", 111111, 40000, 52);
        personArray[1] = new Employee("������ ���� ��������", "�������", "petr@i.com", 222222, 15000, 44);
        personArray[2] = new Employee("����������� ��������� �������������", "�����������", "alex@i.com", 333333, 50000, 31);
        personArray[3] = new Employee("������� ��������� ��������", "���������", "nastasiay@i.com", 444444, 20000, 36);
        personArray[4] = new Employee("�������� ����� ���������", "������� ����������", "dasha@i.com", 555555, 60000, 41);

        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getAge() > 40) {
                personArray[i].printInfo();
                System.out.println();
            }
        }
    }
}
