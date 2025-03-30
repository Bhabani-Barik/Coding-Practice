/*
 Print all prime numbers between 1 and 100.
 */
public class PrintPrimeNums {

    public static void main(String[] args) {
        // A prime number is a whole number greater than 1.
        // that has only two factors: 1 and the number itself.

        System.out.println("Prime numbers between 1 and 100:");
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {  // Loop until √n
            if (n % i == 0) {
                return false;  // Not a prime if divisible by any number
            }
        }
        return true;  // Prime if no divisors found
    }
}