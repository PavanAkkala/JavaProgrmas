package org.example;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInAnArrayByHashmap {

    public static void main(String[] args) {

        int [] arr = {1,2,3,3,4,5,4};
        Set<Integer> seen = new HashSet<>();

        for(int num : arr) {

            if(!seen.add(num)) { // if number is already there in the set then it prints that num ex: 3

                System.out.println(num);
            }
        }
    }
}
