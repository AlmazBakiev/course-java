package ru.gb.javalvl3.almazbakiev;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution {

    private String character = "A";

    public static void main(String[] args) {
        Solution solution = new Solution();
//        new Thread(solution::printA).start();
//        new Thread(solution::printB).start();
//        new Thread(solution::printC).start();
//        Executors.newSingleThreadExecutor().execute(solution::printA);
//        Executors.newSingleThreadExecutor().execute(solution::printB);
//        Executors.newSingleThreadExecutor().execute(solution::printC);
        CompletableFuture<Void> A = CompletableFuture.runAsync(solution::printA);
        CompletableFuture<Void> B = CompletableFuture.runAsync(solution::printB);
        CompletableFuture<Void> C = CompletableFuture.runAsync(solution::printC);
        try {
            System.out.print(A.get());
            System.out.print(B.get());
            System.out.print(C.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public synchronized void printA() {
        for (int i = 0; i < 5; i++) {
            while (character != "A") {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("A");
            character = "B";
            notifyAll();
        }
    }

    public synchronized void printB() {
        for (int i = 0; i < 5; i++) {
            while (character != "B") {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("B");
            character = "C";
            notifyAll();
        }
    }

    public synchronized void printC() {
        for (int i = 0; i < 5; i++) {
            while (character != "C") {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("C");
            character = "A";
            notifyAll();
        }
    }
}
