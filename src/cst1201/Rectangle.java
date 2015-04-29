/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

/**
 * A representation of a rectangle.
 * @author class
 */
public class Rectangle {
    
    
    /**
     * The length of this rectangle. 
     */
    private double length;
    
    /**
     * The width of this rectangle.
     */
    private double width;

    /**
     * Returns the length of this rectangle.
     * @return The length of this rectangle/
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of this rectangle.
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Returns the width of this rectangle.
     * @return the width of this rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
}
