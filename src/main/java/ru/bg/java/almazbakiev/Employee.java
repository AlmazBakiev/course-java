package ru.bg.java.almazbakiev;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public void printInfo() {
        System.out.println("ФИО:                " + this.getFullName());
        System.out.println("Должность:          " + this.getPosition());
        System.out.println("Электронная почта:  " + this.getEmail());
        System.out.println("Номер телефона:     " + this.getPhone());
        System.out.println("Зарплата:           " + this.getSalary() + "р.");
        System.out.println("Возраст:            " + this.getAge());
    }

    public Employee(String fullName, String position, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        setSalary(salary);
        setAge(age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
