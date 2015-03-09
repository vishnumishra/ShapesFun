package com.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by vishnum on 3/6/2015.
 */
public class RectangleTest {

    @Test
    public void testRectangle(){
        Rectangle rectangle = new Rectangle(5.0,2.0);
        double area = rectangle.getArea();
        assertEquals(10,area,0.0);
    }

    @Test
    public void testRectanglePerimeter(){
        Rectangle rectangle = new Rectangle(5.0,2.0);
        assertEquals(14,rectangle.getPerimeter(),1.0);
    }

    @Test
    public void testRectanglePerimeter_2(){
        Rectangle rectangle = new Rectangle(6.0,12.0);
        assertEquals(36.0,rectangle.getPerimeter(),1.0);
    }

    @Test
    public void testSquareArea_01(){
        Square square = new Square(5.0);
        assertEquals(25,square.getArea(),1.0);
    }

    @Test
    public void test(){

    }




}
