package org.example;

public class PascalTriangle {
        public static void main(String[] args) {
            int n = 5; // You can also take input from user using Scanner

            for (int i = 0; i < n; i++) {
                int number = 1;

                for (int j = 0; j <= i; j++) {
                    System.out.print(number + " ");
                    number = number * (i - j) / (j + 1);
                }

                System.out.println();
            }
        }
    }

