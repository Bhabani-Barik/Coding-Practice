//write a small program that determines the number of days in a particular month.
public class NumberOfDaysInMonth {

    //getDaysInMonth
    public static int getDaysInMonth(int month, int year) {

        if (year < 1 || year > 9_999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;  // for any of the following months, return 31
            case 2 -> isLeapYear(year) ? 29 : 28; // if it's February, determine if it's a leap year first, then return either 28 or 29.
            case 4, 6, 9, 11 -> 30; // return 30 for the following months
            default -> -1; // return -1 if the month parameter is not between 1 and 12.
        };
    }

    // isLeapyear
    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9_999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    // Main Method
    public static void main(String[] args) {
        int getDaysInMonth = getDaysInMonth(2, 2025);
        System.out.println("Number of Days in a month:: " + getDaysInMonth);
    }

}


