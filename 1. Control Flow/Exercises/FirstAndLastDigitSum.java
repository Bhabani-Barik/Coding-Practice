/*
write a small program that calculates the sum of the first and last digits of a given number.

TIP:: Use the modulus operator (%) to get the last digit of the number. This is done by calculating number % 10.


*/
package Exercises;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;  // use % 10 to get last digit in a number.
        while (number >= 10) {
            number /= 10;  // divide with 10 until there is 1 digit left (< 10) to get first digit.  This is also equivalent to number = number / 10.
        }

        int firstDigit = number; // this is not necessary, but this makes it clear that number is now the first digit.
        return firstDigit + lastDigit;
    }
}

