package Looping;

public class Sum3and5Challenge {
    public static void main(String[] args) {
        int countOFMatches = 0;
        int sumOfMatches = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                countOFMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }
            if (countOFMatches == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatches);
    }
}
