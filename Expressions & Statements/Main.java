public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if (highScore > 25){
            highScore = 1000 + highScore;
        }
        int health = 100;

        if ((health < 25) && (highScore > 1000)){
                highScore = highScore - 1000;
        }

        int myVariable = 50; //statement
        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("this is" + " another " + "still more.");

        //If-else
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if ((score < 5000) && (score > 1000)) {
            System.out.println("Your score was  less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got Here");
        }

    }
}
