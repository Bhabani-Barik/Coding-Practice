/*
* WAP develop a program capable of ascertaining whether three given numbers are equal, different from each other, or exhibit a combination of both.
*
* Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"

If all numbers are different print text "All numbers are different".

Otherwise, print "Neither all are equal or different"
*
* EXAMPLES OF INPUT/OUTPUT:

printEqual(1, 1, 1); should print text All numbers are equal

printEqual(1, 1, 2); should print text Neither all are equal or different

printEqual(-1, -1, -1); should print text Invalid Value

printEqual(1, 2, 3); should print text All numbers are different
*
*
* */




public class Exercise11_EqualityPrinter {
    public class IntEqualityPrinter {

        private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
        private static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
        private static final String NEITHER_ALL_EQUAL_MESSAGE = "Neither all are equal or different";
        private static final String ALL_DIFF_MESSAGE = "All numbers are different";

        public static void printEqual(int a, int b, int c) {

            if (a < 0 || b < 0 || c < 0) {
                System.out.println(INVALID_VALUE_MESSAGE);
            } else if (a == b && b == c) {
                System.out.println(ALL_EQUAL_MESSAGE);
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println(NEITHER_ALL_EQUAL_MESSAGE);
            } else {
                System.out.println(ALL_DIFF_MESSAGE);
            }
        }
    }

}
