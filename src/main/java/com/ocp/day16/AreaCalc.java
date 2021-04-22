package com.ocp.day16;

public class AreaCalc {
    public static void main(String[] args) {
        double r = 15.0;
        CircleArea ca = new CicleAreaImp();
        System.out.println(ca.getArea(r));
        // 匿名內部類別
        CircleArea ca2 = new CircleArea(){
        
            public double getArea(double r) {
                return r * r * Math.PI;
            }
        
        
        };
        System.out.println(ca2.getArea(r));
    }
}
