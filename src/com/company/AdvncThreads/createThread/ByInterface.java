package com.company.AdvncThreads.createThread;

public class ByInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Implemented Runnable interface ");
    }

    public static void main(String[] args) {
        Runnable runnable1 = new ByInterface();
        Thread thread1 = new Thread(runnable1);
        thread1.start();


        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Make Anonymous Class");
            }
        };

        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
