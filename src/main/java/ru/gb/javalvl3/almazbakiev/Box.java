package ru.gb.javalvl3.almazbakiev;

import java.util.ArrayList;
import java.util.Arrays;


public class Box <T extends Fruit> {

    private final ArrayList<T> box;

    public Box() {
        this.box = new ArrayList<T>();
    }

    public void add(T... obj) {
        box.addAll(Arrays.asList(obj));
    }

    public int getAmount() {
        return box.size();
    }

    public float getWeight() {
        if (box.get(0) != null && box.get(0) instanceof Apple) {
            return Apple.WEIGHT * box.size();
        }
        if (box.get(0) != null && box.get(0) instanceof Orange) {
            return Orange.WEIGHT * box.size();
        }
        return 0.0f;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() - box.getWeight() == 0;
    }

    public void transfer(Box<? super T> toBox) {
        toBox.box.addAll(box);
        box.removeAll(toBox.box);
    }
}
