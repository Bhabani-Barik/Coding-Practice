package Looping;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; count < 3 && i <= 50; i++ ){
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a Prime Number.");
                count++;
                /*if (count == 3) {
                    System.out.println("Dound-3 - Exixting for loop");
                    break;
                }*/
            }
        }
//        System.out.println("Total number of prime numbers between 10 and 50 is:: " + count);
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for ( int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;

    }
}
