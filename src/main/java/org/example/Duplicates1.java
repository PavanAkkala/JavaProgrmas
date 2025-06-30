package org.example;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates1 {


    public static void main(String[] args) {


    }

    public static String isFlip(String input) {

        String[] words = input.split("\\s+");

        StringBuilder result = new StringBuilder();

        for(int i=words.length-1; i>=0; i--) {

            result.append(words[i]);

            if(i!=0) {

                result.append(" ");
            }
        }

        return result.toString();



   }


}
