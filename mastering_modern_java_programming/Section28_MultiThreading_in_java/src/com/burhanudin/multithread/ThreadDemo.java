package com.burhanudin.multithread;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("Hello from java thread"));
        thread1.start();

        Runnable runnable = () -> System.out.println("Hi from java thread");
        Thread thread2 = new Thread(runnable);
        thread2.start();
        // thread2.run();

        HelloThread newHelloThread = new HelloThread();
        newHelloThread.start();

        Thread newHelloThread1 = new Thread(new HelloThread1());
        newHelloThread1.start();

        Thread newHelThread2 = new Thread(Hello::sayHello);
        newHelThread2.start();

        System.out.println("Hello from main thread");
    }
}
