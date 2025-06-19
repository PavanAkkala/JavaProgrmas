package org.example;

public class SumOfArray2 {

        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50}; // Example array
            int sum = 0;

            for (int num : numbers) { // Enhanced for loop
                sum += num;
            }

            System.out.println("Sum of array elements: " + sum);
        }
    }

