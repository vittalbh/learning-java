package com.learning.threads;

public class HelloRunnable implements Runnable {

    private MathUtils utils;

    HelloRunnable(MathUtils utils){
        this.utils = utils;
    }
    public void run() {
        utils.getMultiples(2);
        System.out.println("Hello from a thread! 2");
    }
}
