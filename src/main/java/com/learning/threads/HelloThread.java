package com.learning.threads;

public class HelloThread extends Thread {
    private MathUtils utils;

    HelloThread(MathUtils utils){
        this.utils = utils;
    }

    @Override
    public void run() {
        utils.getMultiples(3);
        System.out.println("Hello from a thread! 1");
    }
}
