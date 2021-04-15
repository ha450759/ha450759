package com.ocp.day12;

class Father {

    public Father(int x) {
        System.out.println("Father: " + x);
    }
    
}
class Son extends Father {

    public Son() {
        super(100);
        System.out.println("Son");
    }
    
}

public class Family {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
