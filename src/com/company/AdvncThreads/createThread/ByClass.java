package com.company.AdvncThreads.createThread;

public class ByClass extends Thread{
    //Three ways to create thread
    //1. extend thread class
    //2. make anonymous class of thread
    //3. implement runnable interface(see another class)

    public void run(){
        System.out.println("Thread class extends " + getName());
    }


    public static void main(String[] args) {
        ByClass obj = new ByClass();
        obj.start();

        Thread thread = new Thread() {
            public void run(){
                System.out.println("Anonymous subclass created " + getName());
            }
        };

        thread.start();
    }
}
