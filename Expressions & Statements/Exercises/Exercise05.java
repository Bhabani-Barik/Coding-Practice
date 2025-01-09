/*
    Write a small program that determines if a particular year is a leap year.

    Leap Year Calculator
    ---------------------
    Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.



To determine whether a year is a leap year, follow these steps:
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.



Another way to put is:

A leap year is a year that is divisible by 4 but not 100.

If it's divisible by 100, it has to be divisible by 400.



The following years are not leap years:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
This is because they are evenly divisible by 100 but not by 400.


The following years are leap years:
1600, 2000, 2400
This is because they are evenly divisible by both 100 and 400.



Examples of input/output:

isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)

isLeapYear(1600); → should return true since 1600 is a leap year

isLeapYear(2017); → should return false since 2017 is not a leap year

isLeapYear(2000);  → should return true because 2000 is a leap year

NOTE: The method isLeapYear needs to be defined as public static like we have been doing so far in the course.

Hints
-----
There are several ways you can implement this method.  This is one way to do it.



Input validation:

Start by checking if the year parameter is within a valid range (1 to 9,999). If it's not, return false to indicate an invalid year.

Determine if the year is a leap year:

If the year parameter is valid, we need to check if it's a leap year based on the given conditions.

Start by checking if the year is divisible by 4. If it is, proceed to the next step.

Check if the year is divisible by 100:

If the year is not divisible by 100, it's a leap year.

Check for exceptions to the leap year rule:

If the year is also divisible by 100, it's not a leap year, unless it's also divisible by 400.

Return the result:

Use the return statement to return true if the year is a leap year based on the conditions above. Otherwise, return false.

*/

public class Exercise05 {
        public static boolean isLeapYear(int year) {
            if ( year < 1 || year > 9_999) {
                return false;
            }

            if( year % 4 == 0) {

                if ( year % 100 != 0){
                    return true;
                } else {
                    if ( year % 400 == 0){
                        return true;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        //main Method
        public static void main(String[] args) {
            isLeapYear(2024);
        }
}

