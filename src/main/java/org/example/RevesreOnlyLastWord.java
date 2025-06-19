package org.example;

public class RevesreOnlyLastWord {
        public static void main(String[] args) {
            String input = "I love java programming";
            String[] words = input.split(" ");

            String lastWord = words[words.length - 1]; // gives last word length
            System.out.println(lastWord);
            String reversedLastWord = new StringBuilder(lastWord).reverse().toString(); // reversing the lastword

            words[words.length - 1] = reversedLastWord; // replace last word with reverse version

            StringBuilder result = new StringBuilder();
            for (String word : words) {
                result.append(word).append(" ");
            }

            // Remove trailing space and print
            System.out.println(result.toString().trim());
        }
    }

