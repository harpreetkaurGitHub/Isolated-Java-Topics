package com.company.AdvncThreads.synchronised;

import org.w3c.dom.html.HTMLDocument;

public class InstanceMethods {

    /**
     * Instance Method
     */
    private int count = 0;

    public synchronized void add1(int value){
        this.count += value;
    }

    /**
     * synchronised block in instance method
     */
    public void add2(int value){

        synchronized(this){
            this.count += value;
        }
    }
    /**
     * synchronised block in instance method
     */
    public synchronized void log1(String msg1, String msg2){
        //log.writeln(msg1);
        //log.writeln(msg2);
    }
    public void log2(String msg1, String msg2){
        synchronized(this){
           // log.writeln(msg1);
           // log.writeln(msg2);
        }
    }

    public static void main(String[] args) {
        InstanceMethods instanceMethods = new InstanceMethods();

    }
}
