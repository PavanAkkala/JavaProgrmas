package org.example;

import java.util.Arrays;

public class LargestAndSecondLargestPrint {

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 55, 99};
        int size = arr.length;

        Arrays.sort(arr); // Sorts in ascending order

        int largest = arr[size - 1]; // Last element after sort
        int secondLargest = Integer.MIN_VALUE;

        // Find the second largest by scanning backwards
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }

        System.out.println("Largest element is: " + largest);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest element is: " + secondLargest);
        } else {
            System.out.println("No second largest element found (all elements might be equal).");
        }
    }
}
