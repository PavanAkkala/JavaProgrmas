package org.example;

public class SumOfArray {

        // Method to calculate the sum of array elements
        public static int calculateSum(int[] numbers) {
            //int[] numbers = {10, 20, 30, 40, 50};
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }

        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50}; // Example array

            // Calling the method
            int result = calculateSum(numbers);

            System.out.println("Sum of array elements: " + result);
        }
    }


