/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

import java.util.Scanner;

/**
 * This class constructs the Room Carpet objects necessary for qurestion 2
 * @author Ari
 */
public class RoomCarpet {

    Scanner userInput = new Scanner(System.in);

    RoomDimension rD = new RoomDimension();
    double costPerSquareFoot;

    /**
     * Constructs a new Room Carpet Object
     */
    public RoomCarpet() {

    }

    /**
     * sets the dimensions of the carpet
     */
    public final void setDimensions() {
        this.rD.setLength(DRY.positiveDouble("What is the length of the room? "));
        this.rD.setWidth(DRY.positiveDouble("What is the width of the room? "));
    }

    /**
     * returns the cost per square foot of the carpet
     * @return $$$ amount the customer is paying per square foot of carpet
     */
    public double getCostPerSquareFoot() {
        return costPerSquareFoot;
    }

    /**
     * sets the cost of the carpet per square foot
     * @param costPerSquareFoot the amount to be updated
     * @return true if the update is successful, else false
     */
    public boolean setCostPerSquareFoot(double costPerSquareFoot) {
        if (costPerSquareFoot < 0) {
            System.out.format("Cost must be a positive value%n");
            return false;
        }
        this.costPerSquareFoot = costPerSquareFoot;
        return true;
    }

    /**
     * Returns the total cost of the carpet
     * @return Amount a customer has to pay
     */
    public double carpetCost() {
        return rD.area() * costPerSquareFoot;
    }
}
