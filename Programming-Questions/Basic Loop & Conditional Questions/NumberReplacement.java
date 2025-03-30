/*
Print numbers from 1 to 50, but replace multiples of 4 with "Four" and multiples of 6 with "Six".
If a number is divisible by both 4 and 6, print "FourSix".
*/


public class NumberReplacement {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println("FourSix");
            } else if (i % 4 == 0) {
                System.out.println("Four");
            } else if (i % 6 == 0) {
                System.out.println("Six");
            } else {
                System.out.println(i);
            }
        }
    }
}
