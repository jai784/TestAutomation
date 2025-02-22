package com.stringprograms.org;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        String input = "successes";
        char result = findSecondMostFrequentCharacter(input);
        if (result != '\0') {
            System.out.println("The second most frequent character is: " + result);
        } else {
            System.out.println("No second most frequent character found.");
        }
    }

    public static char findSecondMostFrequentCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        // Create an array to store the frequency of each character (assuming ASCII characters)
        int[] freq = new int[256];

        // Populate the frequency array
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Find the first most frequent character
        int firstMax = 0, secondMax = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > freq[firstMax]) {
                secondMax = firstMax;
                firstMax = i;
            } else if (freq[i] > freq[secondMax] && freq[i] != freq[firstMax]) {
                secondMax = i;
            }
        }

        // Return the second most frequent character
        return (freq[secondMax] > 0) ? (char) secondMax : '\0';
    }
}
