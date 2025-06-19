package org.example;

public class CheckArrayIsSortedAndRotated {

    public static boolean isSortedAndRotated(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count == 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 1, 2};
       // int[] arr3 = {1, 2, 3, 4, 5};  // not rotated

        System.out.println(isSortedAndRotated(arr1)); // true
        System.out.println(isSortedAndRotated(arr2)); // true
        //System.out.println(isSortedAndRotated(arr3)); // false
    }
}
