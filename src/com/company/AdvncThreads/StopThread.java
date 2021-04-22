package com.company.AdvncThreads;

public class StopThread implements Runnable {
    public static void main(String[] args) {

        StopThread runnable = new StopThread();
        Thread thread = new Thread(runnable);
        thread.start();
        try {
            Thread.sleep(3L*1000L);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        runnable.doStop();
    }

    private boolean doStop = false;

    public synchronized void doStop(){
        this.doStop = true;
    }

    private synchronized boolean keepRunning(){
        return this.doStop == false;
    }
    @Override
    public void run() {
        while (keepRunning()) {
            System.out.println("thread is running");

            try {
                Thread.sleep(3L*1000L);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
