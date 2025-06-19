package org.example;

import java.util.HashSet;

public class FindDuplicates {

        public static void main(String[] args) {
            int[] arr = {4, 2, 7, 2, 4, 9, 1, 7};

            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> duplicates = new HashSet<>();

            for (int num : arr) {
                if (!seen.add(num)) {
                    duplicates.add(num);  // already exists, so it's a duplicate
                }
            }

            System.out.println("Duplicate elements are: "+duplicates);
        }
    }


