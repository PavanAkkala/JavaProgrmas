package org.example;

public class SumOfArrayUsingWhile {

        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            int sum = 0;
            int i = 0;

            while (i < numbers.length) {
                sum += numbers[i];
                i++;
            }

            System.out.println("Sum of array elements: " + sum);
        }
    }

