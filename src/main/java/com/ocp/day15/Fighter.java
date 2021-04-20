package com.ocp.day15;


public class Fighter extends Airplane implements Weapon{

    @Override
    int speed() {
        return  2000;
    }

    @Override
    public void shoot() {
        System.out.println("響尾蛇飛彈");
    }
    
    
    
}
