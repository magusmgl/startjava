import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String firstPlayerName = scan.nextLine();
        Player firstPlayer = new Player(firstPlayerName);

        System.out.print("Введите имя второго игрока: ");
        String secondPlayerName = scan.nextLine();
        Player secondPlayer = new Player(secondPlayerName);

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        
        String continueGame = "";
        do {
            game.start();
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                continueGame = scan.nextLine().trim().toLowerCase();
            } while (!continueGame.equals("yes") &&
                !continueGame.equals("no"));
        } while (!continueGame.equals("no"));
    }
}