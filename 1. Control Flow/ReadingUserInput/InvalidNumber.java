package ReadingUserInput;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
//        int sum = 0;
        double sum = 0;
        while (counter <= 5) {
            System.out.println("Enter Number #" + counter + ": ");
            String nextNumber = scanner.nextLine();
            try {
               /* int number = Integer.parseInt(nextNumber);*/
                double number = Double.parseDouble(nextNumber);
                sum += number;
                counter++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The sum of the 5 numbers = " + sum);
    }
}
