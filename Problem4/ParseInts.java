package Problem4;

import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a line of text");
        String line = scan.nextLine();

        // Use a second Scanner to parse integers from the line of text
        Scanner lineScanner = new Scanner(line);
        while (lineScanner.hasNext()) {
            String token = lineScanner.next();
            // Parse each token as an integer and add to sum
            int number = Integer.parseInt(token); // This line will throw NumberFormatException for non-integers
            sum += number;
        }
        lineScanner.close();
        
        System.out.println("The sum of the integers on this line is " + sum);
    }
}