package Problem4;

import java.util.Scanner;


//The ParseInts class reads a line of text and calculates the sum of all the integers in the line.
public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());

        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Empty catch block to ignore non-integer values
            }
        }
        scanLine.close();

        System.out.println("The sum of the integers on this line is " + sum);
    }
}