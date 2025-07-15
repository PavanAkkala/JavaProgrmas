package org.example;

public class MissingNumber {

    public static int missingNumber(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        int n = num.length + 1;  // Total numbers from 1 to n
        int actualSum = n * (n + 1) / 2;

        int missingNo = actualSum - sum;
        return missingNo;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4,6};  // Missing 2
        int missing = missingNumber(num);
        System.out.println("Missing number is: " + missing);

    }
}
