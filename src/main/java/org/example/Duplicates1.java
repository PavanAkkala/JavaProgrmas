package org.example;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates1 {

    public static void main(String[] args) {



    }

    public static String flipWord(String s) {

        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i=words.length-1; i>=0; i--) {

            sb.append(words[i]);

            if(i!=0) {

                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
