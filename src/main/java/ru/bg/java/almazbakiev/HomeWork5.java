package ru.bg.java.almazbakiev;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivan@i.com", 111111, 40000, 52);
        persArray[1] = new Employee("Петров Петр Петрович", "Слесарь", "petr@i.com", 222222, 15000, 44);
        persArray[2] = new Employee("Александров Александр Александрович", "Программист", "alex@i.com", 333333, 50000, 31);
        persArray[3] = new Employee("Иванова Анастасия Петровна", "Бухгалтер", "nastasiay@i.com", 444444, 20000, 36);
        persArray[4] = new Employee("Сидорова Дарья Андреевна", "Главный специалист", "dasha@i.com", 555555, 60000, 41);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].printInfo();
                System.out.println();
            }
        }
    }
}
