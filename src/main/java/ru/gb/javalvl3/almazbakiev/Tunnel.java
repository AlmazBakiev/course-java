package ru.gb.javalvl3.almazbakiev;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {

    private Semaphore semaphore;

    public Tunnel() {
        this.length = 80;
        this.description = "������� " + length + " ������";
        semaphore = new Semaphore(MainClass.CARS_COUNT / 2);
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " ��������� � �����(����): " + description);
                semaphore.acquire();
                System.out.println(c.getName() + " ����� ����: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " �������� ����: " + description);
                semaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}