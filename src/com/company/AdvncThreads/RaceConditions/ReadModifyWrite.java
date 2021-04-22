package com.company.AdvncThreads.RaceConditions;

public class ReadModifyWrite extends Thread {
    public long count =0;

    public void add(long value) {
       synchronized (this) {

           this.count = count+value;
       }
        System.out.println(count);
    }
    public static void main(String[] args) {

        ReadModifyWrite obj = new ReadModifyWrite();
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();

        thread1.start();
        thread2.start();
        obj.add(2);
    }
}
