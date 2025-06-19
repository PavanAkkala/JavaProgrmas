package org.example;

public class ReverseStringArray {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};

        System.out.println("Original array:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        // Reverse the array in-place
        int left = 0, right = words.length - 1;
        while (left < right) {
            // Swap elements
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        System.out.println("\nReversed array:");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}


/*public static void main(String[] args) {
    String[] words = {"apple", "banana", "cherry", "date", "elderberry"};

    System.out.println("Original array:");
    for (String word : words) {
        System.out.print(word + " ");
    }

    // Call the method to reverse the array
    reverseArray(words);

    System.out.println("\nReversed array:");
    for (String word : words) {
        System.out.print(word + " ");
    }
}

 Method to reverse a String array in-place
public static void reverseArray(String[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        String temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
*/