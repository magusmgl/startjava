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

        GuessNumber guessNum = new GuessNumber(firstPlayer, secondPlayer);
        
        String input = "";
        do {
            guessNum.startGame();
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                input = scan.nextLine().trim().toLowerCase();
            } while (!input.equals("yes") &&
                !input.equals("no"));
        } while (!input.equals("no"));
    }
}