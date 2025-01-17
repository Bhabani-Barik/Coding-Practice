//  write a small program that checks if a number is a palindrome.

/*TIP:: What is a Palindrome number?
    A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.

Tip: Logic to check a palindrome number::
Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
If both are the the same then the number is a palindrome otherwise it is not.

Tip: Logic to reverse a number::
Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
Extract the last digit of the given number by performing the modulo division (remainder).
Store the last digit to some variable say lastDigit = num % 10.
Increase the place value of reverse by one.
To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse.
Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
Repeat steps until number is not equal to (or greater than) zero.

A while loop would be good for this coding exercise.

Tip: Be careful with negative numbers. They can also be palindrome numbers.

Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).

*/

package Exercises;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }
}
