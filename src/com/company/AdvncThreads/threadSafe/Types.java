package com.company.AdvncThreads.ThreadSafe;

public class Types {

    public void temp1(){}

    /**
     * Local variable
     */
    //thread safe
    public void someMethod1(){
        long var = 0;
        var++;
    }

    /**
     * Local Object ref
     */
    // whole method is thread safe
    public void someMethod2() {
        Types obj = new Types();

        obj.temp1();
        temp2(obj);
    }
    public void temp2(Types value){
        value.setValue("value");
    }

    private void setValue(String value) {
        System.out.println(value);
    }
    /**
     * Obj  member variable
     */

    public Types objMemberVariable = new Types();
    StringBuilder stringBuilder = new StringBuilder();

    public void add(int value) {
        this.stringBuilder.append(value);
    }

    //-- not thread safe
    //new Thread(new Types2(objMemberVariable)).start();
    //new Thread(new Types2(objMemberVariable)).start();

    //-- Thread safe
    //new Thread(new Types2(new Type())).start();
    //new Thread(new Types2(new Type())).start();
}
