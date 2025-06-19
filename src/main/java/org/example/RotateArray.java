package org.example;

import java.util.Arrays;

public class RotateArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7}; //7
            int k = 3; // number of rotations

            int n = arr.length;
            System.out.println(n);
            k = k % n; // In case k > n To prevent unnecessary errors

            // Reverse the whole array
            reverse(arr, 0, n - 1); // 7654321 reverse(arr, 0, 6)
            // Reverse the first k elements
            reverse(arr, 0, k - 1); //5674321  reverse(arr, 0, 2)
            // Reverse the remaining elements
            reverse(arr, k, n - 1); //5671234  reverse(arr, 3, 6)

            System.out.println("Array after rotation: " + Arrays.toString(arr));
        }

        public static void reverse(int[] arr, int start, int end) {
            while(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

