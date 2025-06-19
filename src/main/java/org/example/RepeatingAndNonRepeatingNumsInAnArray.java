package org.example;

import java.util.HashMap;
import java.util.Map;

public class RepeatingAndNonRepeatingNumsInAnArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 6, 8, 9, 5};

        // Step 1: Create a HashMap to store frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 2: Count frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Print repeating numbers
        System.out.println("Repeating numbers:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

        // Step 4: Print non-repeating numbers
        System.out.println("\nNon-repeating numbers:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
