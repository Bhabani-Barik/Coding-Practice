public class MainChallenge {
    public static void main(String[] args) {

        //If-else Challenge
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver == true){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean gameOverr = true;
        int score1 = 8000;
        int levelCompleted1 = 8;
        int bonus1 = 100;

        int finalScore1 = score;

        if (gameOverr == true){
            finalScore1 += (levelCompleted1 * bonus1);
            System.out.println("Your final score was " + finalScore1);
        }

    }
}
