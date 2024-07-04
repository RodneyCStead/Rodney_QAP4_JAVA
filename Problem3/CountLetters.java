package Problem3;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or phrase: ");
        String input = scanner.nextLine().toUpperCase();
        int[] letterCounts = new int[26];

        for (int i = 0; i < input.length(); i++) {
            try {
                int index = input.charAt(i) - 'A';
                letterCounts[index]++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not a letter: " + input.charAt(i));

            }
        }

        for (int i = 0; i < letterCounts.length; i++) {
            if (letterCounts[i] > 0) {
                System.out.println((char) (i + 'A') + ": " + letterCounts[i]);
            }
        }
    }
}