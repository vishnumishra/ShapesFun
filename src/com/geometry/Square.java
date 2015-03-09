package com.geometry;

/**
 * Created by vishnum on 3/9/2015.
 */
public class Square {
    private double length;

    public Square(double length) {
        this.length = length;
    }
    public double getArea(){
        return length*length;
    }
}
