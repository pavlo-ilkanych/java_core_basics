package com.company.March.Hw30March;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread(1000);
        Thread thread = new Thread(new RunnableThread());

        myThread.start();
        myThread.join(); //Чекаємо щоб перший потік закінчився.
        thread.start();
    }
}
