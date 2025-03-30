/*
    write a small program that checks if a number is a "teen" number, meaning if it's between 13 and 19.

Teen Number Checker
===================

We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.

The method should return boolean ,and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive),
Otherwise return false.



EXAMPLES OF INPUT/OUTPUT:

hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19

hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19

hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19



Write another method named isTeen with 1 parameter of type int.

The method should return boolean ,and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive),Otherwise return false.

EXAMPLES OF INPUT/OUTPUT:

isTeen(9);  should return false since 9 is in not range 13 - 19

isTeen(13);  should return true since 13 is in range 13 - 19



NOTE: All methods need to be defined as public static ​like we have been doing so far in the course.

Hint:
----
There are several ways you can implement these methods.  This is one way to do it.

isTeen Method:

The isTeen method takes an int number as input and returns true if the number is greater than 12 (meaning it's at least 13) and less than 20 (meaning it's no more than 19). This method checks if the number is within the range of teenage years.

hasTeen Method:

The hasTeen method takes three int numbers as input: a, b, and c.

It uses the logical OR (||) operator to combine the results of calling the isTeen method on each of the three numbers.
The || operator returns true if at least one of the conditions is true.

In other words, hasTeen checks if any of the three numbers is a "teen" (between 13 and 19 years old) using the isTeen method.

Logical Operators:

The && (logical AND) operator returns true if both of its operands are true.

The || (logical OR) operator returns true if at least one of its operands is true.

In the hasTeen method, the || operator is used to combine the results of calling the isTeen method on the three numbers.
If any of the numbers is a "teen," the hasTeen method will return true.
*/


public class Exercise08 {
    public static boolean hasTeen( int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int number) {
        return number > 12 && number < 20;
    }
}
