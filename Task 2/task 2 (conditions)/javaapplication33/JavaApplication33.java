/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;
import java.util.Scanner;
/**
 *
 * @author Haneen
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  


        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;

        do {
            // Prompt user to enter two numbers
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            // Display menu for operations
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Change numbers");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Perform operation based on user's choice
            switch (choice) {
                case 1:
                    double sum = add(num1, num2);
                    System.out.println("Sum: " + sum);
                    break;
                case 2:
                    double difference = subtract(num1, num2);
                    System.out.println("Difference: " + difference);
                    break;
                case 3:
                    double product = multiply(num1, num2);
                    System.out.println("Product: " + product);
                    break;
                case 4:
                    if (num2 != 0) {
                        double quotient = divide(num1, num2);
                        System.out.println("Quotient: " + quotient);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case 5:
                    // Allow user to change numbers
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        scanner.close();
    }

    // Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
    
    
    
    

