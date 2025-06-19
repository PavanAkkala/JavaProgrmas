package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementInAnArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Sample array
            int[] array = {5, 3, 7, 3, 9, 1, 3};

            // Prompt user for search element
            System.out.print("Enter the element to search: ");
            int searchElement = scanner.nextInt();

            // List to store indices of found elements
            ArrayList<Integer> foundIndices = new ArrayList<>();

            // Search for the element
            for (int i = 0; i < array.length; i++) {
                if (array[i] == searchElement) {
                    foundIndices.add(i); // it will add the index of the particular number you have searched ex: 3
                }
            }

            // Display results
            if (foundIndices.isEmpty()) {
                System.out.println("Element not found.");
            } else {
                System.out.println("Element found at index/indices: " + foundIndices);
            }

            scanner.close();
        }
    }

