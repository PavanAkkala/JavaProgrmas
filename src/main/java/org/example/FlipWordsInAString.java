package org.example;

public class FlipWordsInAString {

    public static void main(String[] args) {
        String sentence = "Java is fun";
        String flipped = flipWords(sentence);
        System.out.println("Flipped sentence: " + flipped);
    }

    public static String flipWords(String input) {
        // Split the sentence into words using space
        String[] words = input.trim().split("\\s+");

        // Reverse the word order
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
