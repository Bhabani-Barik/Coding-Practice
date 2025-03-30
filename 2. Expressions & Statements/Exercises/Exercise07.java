/*
    write a small program that checks if the sum of two numbers are equal to a third number.

Equal Sum Checker
=================

Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.



EXAMPLES OF INPUT/OUTPUT:

hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1

hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2

hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0



NOTE: The hasEqualSum method needs to be defined as public static like we have been doing so far in the course.

 Hint:
 ====
Adding Values: The method's purpose is to check if the sum of a and b is equal to c. Make sure to sum up a and b using the + operator.

Comparison: After adding a and b, compare the result with the value of c using the == operator.

Return Statement: The method should return true if the sum of a and b is equal to c, and false otherwise.
 */


public class Exercise07 {
    public  static boolean hasEqualSum( int a, int b, int c) {

        return ( a + b ) == c;

    }

}
