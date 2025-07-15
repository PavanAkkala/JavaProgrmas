package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstnonRepeatingCharacterInAString {

    public static void main(String[] args) {
        String input = "swiss";

        // Use LinkedHashMap to maintain insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count character frequencies
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with count = 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
