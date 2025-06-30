package org.example;

import java.util.ArrayList;
import java.util.List;

public class GetNumberSatrtsWithOne {


    // Method to get the first digit of a number
    public static int getFirstDigit(int num) {
        while (num >= 10) {
            num = num / 10;
        }
        return num;
    }

    // Method to filter numbers starting with digit 1
    public static List<Integer> getNumbersStartingWithOne(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            int firstDigit = getFirstDigit(num);
            if (firstDigit == 1) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] res1 = {1, 23, 123, 45, 67, 167, 10, 12, 901};

        List<Integer> li = getNumbersStartingWithOne(res1);

        System.out.println(li);
    }
}
