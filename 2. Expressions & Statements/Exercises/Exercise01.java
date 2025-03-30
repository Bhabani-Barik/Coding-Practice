//Exercise: WAP to create a simple program that can check whether a number is positive, negative or zero.

//Write a method called 'checkNumber' with an 'int' parameter named 'number'.
/*
* The method should not return any value, and it needs to print out:

    - "positive" if the parameter number is > 0

    - "negative" if the parameter number is < 0

    - "zero" if the parameter number is equal to 0
 */
public class Exercise01 {
    public  static  void checkNumber(int number){
        if (number > 0){
            System.out.println("Positive");
        } else if ( number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
    //main method
    public static void main(String[] args) {
        checkNumber(-56);
        checkNumber(60);
        checkNumber(0);

    }
}
/*
    Note:
     Remember that > 0 is exclusive of zero, and that >= 0 is inclusive of zero.
     The if statement is designed to verify a boolean condition.
     If the condition evaluates to true, the code within the block is executed; otherwise, it's not executed.
*/
