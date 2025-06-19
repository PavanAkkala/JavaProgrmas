package org.example;

public class ReversePreserveSpaces {

        public static void main(String[] args) {
            String input = "a b c d";
            char[] inputArr = input.toCharArray();
            char[] result = new char[input.length()]; //This creates a new character array named result with the same length as the original string

            // Mark the spaces in result array
            for (int i = 0; i < input.length(); i++) {
                if (inputArr[i] == ' ') {
                    result[i] = ' ';
                }
            }

            // Reverse characters, skipping spaces
            int j = input.length() - 1;
            for (int i = 0; i < input.length(); i++) {
                if (inputArr[i] != ' ') {
                    while (result[j] == ' ') { // if result array contains space ignore that index and decrement by counter 1
                        j--;
                    }
                    result[j] = inputArr[i]; // if input array is not space put it in result array
                    j--;  // reduce the counter
                }
            }

            System.out.println("Original: " + input);
            System.out.println("Reversed (preserving spaces): " + new String(result));
        }
     }

