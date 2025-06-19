package org.example;

public class MatchFirstAndLastCharacter {
    public static void main(String[] args) {

        String input = "level racecar hello noon test madam wow java";

        String[] words = input.split("\\s+"); // Split by spaces

        for (String word : words) {
            if (word.length() > 1 && word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println(word);
            }
        }
    }
}
