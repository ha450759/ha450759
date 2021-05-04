package com.ocp.day20;

import java.util.Objects;

public class Pen {
    private  String color;
    private int  price;

    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.color);
        hash = 97 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pen other = (Pen) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
//    @Override
//    public boolean equals(Object obj) {
//        Pen p =(Pen)obj;
//        if(price == p.price && color.equals(p.color)) {
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 7 * 11 * color.hashCode() * price;
//    }
    
    @Override
    public String toString() {
        return "Pen{" + "color=" + color + ", price=" + price + '}';
    }
    
}
