package com.learning.threads;

public class MathUtils {

    public void getMultiples(int n) {

        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i * n);
            }
        }
    }
}
