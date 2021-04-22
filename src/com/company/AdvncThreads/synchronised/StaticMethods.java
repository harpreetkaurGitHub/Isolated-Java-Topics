package com.company.AdvncThreads.synchronised;

public class StaticMethods {
    /**
     * synchronised block in static methods
     */
    public static synchronized void log1(String msg1, String msg2){
//        log.writeln(msg1);
//        log.writeln(msg2);
    }
    public static void log2(String msg1, String msg2){
        synchronized(StaticMethods.class){
//            log.writeln(msg1);
//            log.writeln(msg2);
        }
    }

    /**
     * synchronised block in instance method
     */
    public synchronized void log3(String msg1, String msg2){
        //log.writeln(msg1);
        //log.writeln(msg2);
    }
    public void log4(String msg1, String msg2){
        synchronized(this){
            // log.writeln(msg1);
            // log.writeln(msg2);
        }
    }
}
