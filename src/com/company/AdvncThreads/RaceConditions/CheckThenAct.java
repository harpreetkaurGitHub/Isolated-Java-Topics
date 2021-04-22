package com.company.AdvncThreads.RaceConditions;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class CheckThenAct {

    // First Method
    private boolean locked = false;
    public synchronized void checkThenAct1(Map<String, String> sharedMap) {
        if(sharedMap.containsKey("key") && !locked){
            locked = true;
            String val = sharedMap.remove("key");
            if(val == null) {
                System.out.println("Value for 'key' was null");

            }
            locked = false;
        } else {
            sharedMap.put("key", "value");
        }
    }
// Second Method
    public boolean checkThenAct2(Map<String, String> sharedMap) {
        AtomicBoolean locked = new AtomicBoolean(false);
        if(sharedMap.containsKey("key") ){
            String val = sharedMap.remove("key");
            if(val == null) {
                System.out.println("Value for 'key' was null");

            }
        } else {
            sharedMap.put("key", "value");
        }
        return locked.compareAndSet(false, true);
    }
}
