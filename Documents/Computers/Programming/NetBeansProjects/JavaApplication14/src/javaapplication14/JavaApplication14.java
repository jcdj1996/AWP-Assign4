/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Ari
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int[] array =new int[10];// {32,27,64,18,95,14,90,70,60,37};
        
        for (int i = 0;i<array.length;i++){
            array[i]=2+2*i;
        }
        System.out.format("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter<array.length; counter++){
            System.out.format("%5d%8d%n", counter, array[counter]);
        }
    }
    
}
