package com.company.AdvncThreads.Locks;

import java.util.concurrent.locks.Lock;

public class SimpleLock {

    //but dont use for multithreading just an imaginary implementation
    private ReentranceLock lock = new ReentranceLock();
    private int count = 0;

    public int inc() throws InterruptedException {
        lock.lock();
        int newCount = ++count;
        lock.unlock();
        return newCount;
    }

    public static void main(String[] args) {

    }
}
