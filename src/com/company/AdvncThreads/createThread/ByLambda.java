package com.company.AdvncThreads.createThread;

public class ByLambda {



    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Lambda runnable method");
        };

        Thread thread = new Thread(runnable);
        thread.start();


        //executing the main() thread
        System.out.println("Thread : " + Thread.currentThread().getName());
        for(int i=0;i<10;i++)
        {
            new Thread("" + i){
                public void run(){
                    System.out.println("Thread : " + getName() + " running");
                }
            }.start();
        }

    }
}
