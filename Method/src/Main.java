public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1500;
        int levelCompleted = 5;
        int bonus = 0;


        calculateScore(gameOver, score, levelCompleted,bonus);
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

       int playerPosition = calculateHighScorePosition(1500);
       displayHighScorePosition("Hank", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Trudy", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gerard", playerPosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);

            return finalScore;
        }
        return -1;

    }
    public static void displayHighScorePosition (String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }
    public static int calculateHighScorePosition (int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100){
            return 3;
        }
        else return 4;
    }


}
