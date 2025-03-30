package ReadingUserInput;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to exit: ");
            String nextEntry = scanner.nextLine();
            try {
               double validNumber = Double.parseDouble(nextEntry);
               if (loopCount == 0 || validNumber < min) {
                   min = validNumber;
               }
               if (loopCount == 0 || validNumber > max) {
                   max = validNumber;
               }
               loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("Min :: " + min + ", Max :: " + max );
        } else {
            System.out.println("Sorry! No valid data entered");
        }
    }
}
