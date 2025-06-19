package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Add all elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check if elements in nums2 exist in set1
        for (int num : nums2) { // nums2 = {2,2}
            if (set1.contains(num)) {  // 2 is in set1 add to the resultset
                resultSet.add(num);  //final result is resultSet = [2]
            }
        }

        // Convert resultSet to an array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersection = intersection(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(intersection));
    }
}
