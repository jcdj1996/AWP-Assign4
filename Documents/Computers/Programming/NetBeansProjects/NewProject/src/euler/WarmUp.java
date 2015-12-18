/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class WarmUp {

    public static void main(String[] args) {
        System.out.println(iceCold(new Scanner(System.in).nextLine()));
    }

    public static String iceCold(String s) {
        return (s.length() > 0)
                ? (s.charAt(0) == ' ')
                ? '_' + iceCold(s.substring(1))
                : s.charAt(0) + iceCold(s.substring(1))
                : s;
    }

}
