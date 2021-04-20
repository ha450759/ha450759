package com.ocp.day15;

public class Tank extends Car implements Weapon, Oil{

    @Override
    void move() {
        System.out.println("用覆帶走");
    }

    @Override
    public void shoot() {
        System.out.println("穿甲彈");
    }

    @Override
    public int spend() {
        return 300;
    }
    
    
}
