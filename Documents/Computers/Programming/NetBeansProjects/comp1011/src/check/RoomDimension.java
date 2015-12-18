/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

/**
 * This class holds the room dimensions for question 2
 * @author Ari
 */
public class RoomDimension {

    private double length;
    private double width;

    /**
     * Constructs a new RoomDimension
     */
    public RoomDimension() {
    }

    /**
     * Constructs a new RoomDimension with length and width
     * @param length
     * @param width
     */
    public RoomDimension(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    /**
     * Returns the length of a room
     * @return  the length side of a room
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of a room
     * @param length numerical value of the room's length
     * @return true if the set suceeds, else false
     */
    public final boolean setLength(double length) {
        if (length <= 0) {
            System.out.format("length must be greater than 0");
            return false;
        }
        this.length = length;
        return true;
    }

    /**
     * Returns the numerical value fo the Room's width
     * @return width of the room
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the room
     * @param width numerical value of the room
     * @return true if the update succeeds, else false
     */
    public final boolean setWidth(double width) {
        if (width <= 0) {
            System.out.format("width must be greater than 0");
            return false;
        }
        this.width = width;
        return true;
    }

    /**
     * Calculates the area of the room
     * @return area of the room
     */
    public double area() {
        return length * width;
    }
}
