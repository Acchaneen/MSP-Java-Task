/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;
import java.util.Scanner;
/**
 *
 * @author Haneen
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the base
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        // Prompt user to enter the power
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Calculate the power using Math.pow() method
        double result = Math.pow(base, power);

        // Print the result
        System.out.println(base + " ^ " + power + " = " + result);

        scanner.close();
    }
}
   
    

