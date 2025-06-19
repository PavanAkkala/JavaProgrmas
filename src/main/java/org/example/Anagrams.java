package org.example;

import java.util.Arrays;

public class Anagrams {

    public static boolean isAnagram(String s1, String s2) {

      String  str1 = s1.replaceAll("\\s", "");

      String str2 = s2.replaceAll("\\s","");

        if(str1.length()!=str2.length()) {

            return false;
        }

        else {

          char[] c1 =  str1.toLowerCase().toCharArray(); //covert String to char array

          char[] c2 = str2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1, c2);
        }

    }

    public static void main(String[] args) {

//        String str1 = "listen";
//        String str2 = "silent";

        System.out.println(isAnagram("DonSeenu", "Silent"));
        System.out.println(isAnagram("anagram","nagaram"));

//        boolean result = isAnagram(str1,str2);
//
//        if (result) {
//            System.out.println("Strings are anagrams.");
//        } else {
//            System.out.println("Strings are NOT anagrams.");
//        }

    }
}
