package org.example;

public class Practice2 {

    public static int don(int[] a) {

        int sum = 0;
        int i = 0;
        while (i < a.length) {

            sum += a[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] a = {20,30,45,70,90};
        int res = don(a);
        System.out.println(res);
    }
}