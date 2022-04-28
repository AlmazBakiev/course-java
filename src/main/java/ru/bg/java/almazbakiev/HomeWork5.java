package ru.bg.java.almazbakiev;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] personArray = new Employee[5];
        personArray[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivan@i.com", 111111, 40000, 52);
        personArray[1] = new Employee("Петров Петр Петрович", "Слесарь", "petr@i.com", 222222, 15000, 44);
        personArray[2] = new Employee("Александров Александр Александрович", "Программист", "alex@i.com", 333333, 50000, 31);
        personArray[3] = new Employee("Иванова Анастасия Петровна", "Бухгалтер", "nastasiay@i.com", 444444, 20000, 36);
        personArray[4] = new Employee("Сидорова Дарья Андреевна", "Главный специалист", "dasha@i.com", 555555, 60000, 41);

        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getAge() > 40) {
                personArray[i].printInfo();
                System.out.println();
            }
        }
    }
}
