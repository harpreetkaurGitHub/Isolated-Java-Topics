package com.company.AdvncThreads.threadLocal.InitialThreadLocalValue;
import java.util.function.Supplier;

public class SupplierInterface {

    ThreadLocal<String> threadLocal1 = ThreadLocal.withInitial(new Supplier<String>() {
        @Override
        public String get() {
            return String.valueOf(System.currentTimeMillis());
        }
    });

    //Lambda Expression
    ThreadLocal threadLocal2 = ThreadLocal.withInitial(
            () -> { return String.valueOf(System.currentTimeMillis()); } );

}
