package org.example;

public class PatternRetest {
        public static void main(String[] args) {
            String word = "retest";

            for (int i = word.length(); i > 0; i--) {
                System.out.println(word.substring(0, i));
            }
        }
    }

