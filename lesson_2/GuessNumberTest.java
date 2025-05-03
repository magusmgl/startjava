import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String firstPlayerName = scan.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String secondPlayerName = scan.nextLine();

        Player firstPlayer = new Player(firstPlayerName);
        Player secondPlayer = new Player(secondPlayerName);
        GuessNumber guessNumStart = new GuessNumber(firstPlayer, secondPlayer);
        Random rnd = new Random();
        int hiddenNum = rnd.nextInt(1, 101);
        guessNumStart.setHiddenNum(hiddenNum);

        System.out.printf("\nКомпьютер загадал число от 1 до 100. Вам нужно угадать данное число.%n");
        boolean isContinueGame = true;
        int firstPlayerNum;
        int secondPlayerNum;
        while (isContinueGame) {
            do {
                System.out.print(firstPlayer.getName() + " введите число от 1 до 100: ");
                firstPlayerNum = scan.nextInt();            
            } while (firstPlayerNum < 1 || firstPlayerNum > 100);

            firstPlayer.setNumber(firstPlayerNum);
            scan.nextLine();
            
            firstPlayer.setTurnGuessNum(true);
            secondPlayer.setTurnGuessNum(false);
            String continueGame;
            if (guessNumStart.isPlayerGuessNum()) {
                do {
                    System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                    continueGame = scan.nextLine();
                } while (!(continueGame.equalsIgnoreCase("YES") ||
                        continueGame.equalsIgnoreCase("NO")));
            
                if (continueGame.equalsIgnoreCase("YES")) {
                    hiddenNum = rnd.nextInt(1, 101);
                    guessNumStart.setHiddenNum(hiddenNum);
                    continue;
                } else {
                    isContinueGame = false;
                    continue;
                }
            }
            
            do {
                System.out.print(secondPlayer.getName() + " введите число от 1 до 100: ");
                secondPlayerNum = scan.nextInt();
            } while (secondPlayerNum < 1 || secondPlayerNum > 100);

            secondPlayer.setNumber(secondPlayerNum);
            scan.nextLine();

            firstPlayer.setTurnGuessNum(false);
            secondPlayer.setTurnGuessNum(true);
            if (guessNumStart.isPlayerGuessNum()) {
                do {
                    System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                    continueGame = scan.nextLine();
                } while (!(continueGame.equalsIgnoreCase("YES") ||
                        continueGame.equalsIgnoreCase("NO")));
            
                if (continueGame.equalsIgnoreCase("YES")) {
                    hiddenNum = rnd.nextInt(1, 101);
                    guessNumStart.setHiddenNum(hiddenNum);
                    continue;
                } else {
                    isContinueGame = false;
                    continue;
                }
            }
        }
    }
}