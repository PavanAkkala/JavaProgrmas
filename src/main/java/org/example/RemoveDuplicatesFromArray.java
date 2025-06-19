package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            unique.add(num);
        }

        System.out.println("Array after removing duplicates:"+unique);
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}
