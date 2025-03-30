/*
     write a small program that determines if two numbers are equal, up to three decimal places.

DecimalComparator
=================
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.



EXAMPLES OF INPUT/OUTPUT:

areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.



TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.

Hint:
====
Rounding to Three Decimal Places: Remember that to compare doubles up to three decimal places, you need to round both values to three decimal places. This is achieved by multiplying the numbers by 1000 and converting them to long. This is because 1000 corresponds to three decimal places (i.e., 1.234 * 1000 = 1234).

Comparison: After rounding, you can compare the two rounded values using the == operator. This checks if the rounded values are equal.

Return Statement: The method should return true if the rounded values are equal, and false otherwise.
*/


public class Exercise06 {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        long firstRounded = (long) (first * 1000);
        long secondRounded = (long) (second * 1000);
        return firstRounded == secondRounded;
    }
    //main method
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.0, 3.0);
    }
}
