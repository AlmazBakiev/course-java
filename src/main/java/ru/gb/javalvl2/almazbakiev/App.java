package ru.gb.javalvl2.almazbakiev;

public class App {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    float[] arr10Mln = new float[SIZE];

    public static void main(String[] args) {
        App app = new App();
        app.firstMethod();
        try {
            app.secondMethod();
            app.thirdMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void firstMethod() {
        initialArray(arr10Mln);
        long startTime = System.currentTimeMillis();
        calculated(arr10Mln);
        System.out.println("Время выполнения первого метода с одним потоком: " + (System.currentTimeMillis() - startTime));
    }

    public void secondMethod() throws InterruptedException {
        initialArray(arr10Mln);
        float[] leftHalf = new float[HALF];
        float[] rightHalf = new float[HALF];
        long startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            System.arraycopy(arr10Mln, 0, leftHalf, 0, HALF);
            calculated(leftHalf);
            System.arraycopy(leftHalf, 0, arr10Mln, 0, HALF);
        });
        Thread thread2 = new Thread(() -> {
            System.arraycopy(arr10Mln, HALF, rightHalf, 0, HALF);
            calculated(rightHalf);
            System.arraycopy(leftHalf, 0, arr10Mln, HALF, HALF);
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Время выполнения второго метода с двумя потоками: " + (System.currentTimeMillis() - startTime));
    }

    public void thirdMethod() throws InterruptedException {
        initialArray(arr10Mln);
        float[] leftHalf = new float[HALF];
        float[] rightHalf = new float[HALF];
        long startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            System.arraycopy(arr10Mln, 0, leftHalf, 0, HALF);
            calculated(leftHalf);
            System.arraycopy(leftHalf, 0, arr10Mln, 0, HALF);
        });
        Thread thread2 = new Thread(() -> {
            System.arraycopy(arr10Mln, HALF, rightHalf, 0, HALF);
            calculated(rightHalf);
            System.arraycopy(leftHalf, 0, arr10Mln, HALF, HALF);
        });
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println("Время выполнения третьего метода с двумя потоками, но второй запускается после первого: "
                + (System.currentTimeMillis() - startTime));
    }

    public float[] calculated(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }

    public float[] initialArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        return arr;
    }
}
