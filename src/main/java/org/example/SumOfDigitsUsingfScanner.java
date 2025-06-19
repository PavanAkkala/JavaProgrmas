package org.example;

import java.util.Scanner;

public class SumOfDigitsUsingfScanner {

        // Method to calculate sum of digits
        public static int sumOfDigits(int num) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10; // Extract the last digit and add to sum
                num /= 10; // Remove the last digit
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Calling the method to get sum of digits
            int sum = sumOfDigits(number);

            System.out.println("Sum of digits: " + sum);

            scanner.close();
        }
    }

