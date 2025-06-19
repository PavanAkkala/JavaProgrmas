package org.example;

public class SumNumberInAString {

    public static void main(String[] args) {
        String input = "abc12xyz34po57";

        int sum = 0;

        // Use regex to find groups of digits \\d+ = regex that matches one or more digits
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\d+").matcher(input);

        while (matcher.find()) {
            // Convert each match to integer and add to sum matcher.group() returns each numeric substring (like "12", "34", "57")
            sum += Integer.parseInt(matcher.group());
        }

        System.out.println("Sum of numbers: " + sum);  // Output: 103
    }
}
