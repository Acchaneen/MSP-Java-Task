/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;
 import java.util.Scanner;
/**
 *
 * @author Haneen
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        
        System.out.println("Enter numbers (enter a negative number to exit):");

        
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            
            if (number < 0) {
                break; 
            }

            sum += number;
        }

        
        System.out.println("Sum of numbers entered (excluding negatives): " + sum);

        scanner.close();
    }
}
    
    
    

