package ss08_clean_code_and_refactoring.exercise;

public class RefactoringTennisGame {
    public static String scoreDisplay(int playerScore) {
        String scoreDisplay = "";
        switch (playerScore) {
            case 0:
                scoreDisplay = "Love-All";
                break;
            case 1:
                scoreDisplay = "Fifteen-All";
                break;
            case 2:
                scoreDisplay = "Thirty-All";
                break;
            case 3:
                scoreDisplay = "Forty-All";
                break;
            case 4:
                scoreDisplay = "Deuce";
                break;
        }
        return scoreDisplay;
    }

    public static String resultDisplay(int playerScore1, int playerScore2) {
        int minusResult = playerScore1 - playerScore2;
        if (minusResult == 1) return "Advantage player1";
        else if (minusResult == -1) return "Advantage player2";
        else if (minusResult >= 2) return "Win for player1";
        else return "Win for player2";
    }
    public static String matchDisplay(int playerScore){
        String result = "";
        switch(playerScore) {
            case 0:
                result = "Love";
                break;
            case 1:
                result = "Fifteen";
                break;
            case 2:
                result = "Thirty";
                break;
            case 3:
                result = "Forty";
        }
        return result;
    }
    public static String getScore(int player1Score, int player2Score) {
        if (player1Score == player2Score) return scoreDisplay(player1Score);
        else if (player1Score >= 4 || player2Score >= 4) return resultDisplay(player1Score, player2Score);
        else return matchDisplay(player1Score) + " - " + matchDisplay(player2Score);
    }
}