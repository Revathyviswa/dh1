/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out
                .println("Enter the number till which the prime numbers are to be calculated: ");
        int input = scanner.nextInt();

        int count = 0;

        // loop through the numbers one by one
        for (int i = 2; i < input; i++) {

            boolean isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }

            // print the number if prime
            if (isPrimeNumber) {
                count++;
                System.out.print(i + ", ");

            }

        }
        System.out.println("Count: " + count);
    }

}
    

