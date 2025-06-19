package org.example;

public class WordEndingwithLetterE {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "banana", "grape", "pine", "tree", "mango"};

        System.out.println("Words ending with 'e':");
        for (String word : words) {
            if (word.endsWith("e")) {
                System.out.println(word);
            }
        }
    }
}
