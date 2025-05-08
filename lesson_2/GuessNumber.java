import java.util.Random;
import java.util.Scanner;
        
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

    public void startGame() {
        Random rnd = new Random();
        hiddenNum = rnd.nextInt(1, 101);
        System.out.println(hiddenNum);

        int firstPlayerNum;
        int secondPlayerNum;
        boolean isGameOver = false;
        Scanner scan = new Scanner(System.in);
        System.out.printf("\nКомпьютер загадал число от 1 до 100. Вам нужно угадать данное число.%n");
        do {
            do {
                System.out.println(firstPlayer.getName() + " введите число: ");
                firstPlayerNum = scan.nextInt();
            } while (!firstPlayer.setNumber(firstPlayerNum)); 
            
            if (firstPlayer.getNumber() == hiddenNum) {
                System.out.println(firstPlayer.getName() + " выиграл!");
                isGameOver = true;
                break;
            }

            do {
                System.out.println(secondPlayer.getName() + " введите число: ");
                secondPlayerNum = scan.nextInt();
            } while (!secondPlayer.setNumber(secondPlayerNum)); 
            
            if (secondPlayer.getNumber() == hiddenNum) {
                System.out.println(secondPlayer.getName() + " выиграл!");
                isGameOver = true;
            }
        } while (!isGameOver);
    }
}