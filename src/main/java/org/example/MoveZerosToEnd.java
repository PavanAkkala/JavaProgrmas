package org.example;

public class MoveZerosToEnd {

    public static void moveZeros(int[] nums) {
        int index = 0;  // Position to place the next non-zero element

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Step 2: Fill remaining positions with 0
        while (index < nums.length) { // 3<5
            nums[index] = 0; // Means placing the 0 in the last values 3 and 4
            index++;
        }
    }


    //retun nums and add int[] in method to return

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeros(nums);

        System.out.print("Array after moving zeros: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
