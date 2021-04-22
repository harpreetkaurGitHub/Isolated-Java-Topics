package com.company.AdvncThreads;

public class ImmutableVariable {

    private int value = 0;

    public ImmutableVariable(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public synchronized ImmutableVariable add(int valueToAdd){
        return new ImmutableVariable(this.value + valueToAdd);
    }

    public static void main(String[] args) {
        ImmutableVariable obj1 = new ImmutableVariable(12);

        System.out.println(obj1.add(12).getValue());
        System.out.println(obj1.getValue());
    }
}
