package com.company.AdvncThreads.threadLocal.InitialThreadLocalValue;

public class OverrideInitialValueMethod {
    private ThreadLocal myThreadLocal = new ThreadLocal<String>() {
        @Override protected String initialValue() {
            return String.valueOf(System.currentTimeMillis());
        }
    };
}
