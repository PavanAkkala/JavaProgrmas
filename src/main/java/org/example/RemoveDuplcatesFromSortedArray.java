package org.example;

public class RemoveDuplcatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int i = 0; // Pointer to track unique elements

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // Copy non-duplicate value
            }
        }

        return i + 1; // New length after removing duplicates
    }

    public static void main(String[] args) {
        RemoveDuplcatesFromSortedArray sol = new RemoveDuplcatesFromSortedArray();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = sol.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + newLength);
        System.out.print("Unique elements: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
