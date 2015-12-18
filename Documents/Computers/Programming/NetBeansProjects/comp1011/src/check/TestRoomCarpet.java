/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

/**
 * This is the Tester Class for Room Carpet
 * @author Ari
 */
public class TestRoomCarpet {
    
    /**
     * main method runs through the steps of question 2
     * @param args
     */
    public static void main (String[] args){
        RoomCarpet carpet = new RoomCarpet();

        carpet.setDimensions();
        carpet.setCostPerSquareFoot(DRY.positiveDouble("What is the carpet's cost per square foot? "));
        System.out.format("The cost of the carpet is $%.2f%n", carpet.carpetCost());
        
    }
}
