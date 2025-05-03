import java.util.Random;

public class GuessNumber {
    private int hiddenNum;
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void setHiddenNum(int hiddenNum) {
        this.hiddenNum = hiddenNum;
    }

    public boolean isPlayerGuessNum() {
        Player currentPlayer = firstPlayer.getTurnGuessNum() ? firstPlayer : secondPlayer;
        if (hiddenNum < currentPlayer.getNumber()) {
            System.out.printf("%s число %d больше того, что загадал компьютер%n",
                    currentPlayer.getName(), currentPlayer.getNumber());
            return false;
        } else if (hiddenNum > currentPlayer.getNumber()) {
            System.out.printf("%s число %d меньше того, что загадал компьютер%n",
                    currentPlayer.getName(), currentPlayer.getNumber());
            return false;
        } else {
            System.out.printf("%s ты угадал число!%n", currentPlayer.getName());
            return true;
        }
    }
}