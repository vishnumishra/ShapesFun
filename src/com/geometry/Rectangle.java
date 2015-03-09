package com.geometry;

/**
 * Created by vishnum on 3/6/2015.
 */
public class Rectangle {
    private double length,width;
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public void sacleLength(int scaleFactor){
        this.length *= scaleFactor;

    }
    public double getArea(){
        return this.length*this.width;
    }

    public double getPerimeter() {
        return 2*(length+width);
    }

}
