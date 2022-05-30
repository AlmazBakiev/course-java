package ru.gb.javaLvl2.almazbakiev;

public class Cat implements AthleticSkills {

    private final int LIMITE_RUN = 150;
    private final int LIMITE_JUMP = 3;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(int length) {
        if (length <= LIMITE_RUN) {
            System.out.println("��� " + getName() + " �������� ��������� �� �����������");
            return false;
        } else {
            System.out.println("��� " + getName() + " �� ���� ��������� ������ " + LIMITE_RUN + "� � ���������� �� ����");
        }
        return true;
    }

    @Override
    public boolean jump(int length) {
        if (length <= LIMITE_JUMP) {
            System.out.println("��� " + getName() + " ����������� ����������� � ������� ������");
            return false;
        } else {
            System.out.println("��� " + getName() + " �� ��������� ����������� � ���������� �� ����");
        }
        return true;
    }
}
