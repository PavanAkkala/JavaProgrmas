package org.example;

public class Practice {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        int i = 0;

        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] num = {20,30,40,50};

        int res = calculateSum(num);
        System.out.println(res);
    }
}
