package org.example;

public class ReverseAnArray {
        // Method to reverse an array
        public static void reverseArray(int[] arr) {
            int start = 0, end = arr.length - 1;
            while (start < end) {
                // Swap elements
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5}; // Example array

            System.out.println("Original Array:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

            // Calling the method to reverse the array
            reverseArray(numbers);

            System.out.println("\nReversed Array:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }


