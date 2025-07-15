package org.example;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicates1 {

    public static void main(String[] args) {

        String str = "Don Reddy";

        String res = flip(str);

        System.out.println(res);
    }

    public static String flip(String input) {

        String[] words = input.trim().split("\\s+");

        StringBuilder result = new StringBuilder();
        for (int i=words.length-1;i>=0; i--) {

            result.append(words[i]);

            if(i!=0) {

                result.append(" ");
            }
        }

        return result.toString();
    }

}
