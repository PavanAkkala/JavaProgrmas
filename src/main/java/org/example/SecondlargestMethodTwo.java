package org.example;

import java.util.Arrays;

public class SecondlargestMethodTwo {

        public static void main(String[] args) {
            int[] arr = {10, 20, 4, 45, 88, 99};
            int size = arr.length;
            System.out.println(size);

            Arrays.sort(arr);

            int largest = arr[size - 1]; //Giving last element to the largest
            for (int i = size - 2; i >= 0; i--) {
                if (arr[i] < largest) {
                    System.out.println("Second largest element is: " + arr[i]);
                    return;
                }
            }

            System.out.println("No second largest element found (all elements might be equal).");
        }
    }


