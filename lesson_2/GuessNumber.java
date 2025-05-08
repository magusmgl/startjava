import java.util.Random;
import java.util.Scanner;
        
public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int hiddenNum;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        Random rnd = new Random();
        hiddenNum = rnd.nextInt(1, 101);
        
        int firstPlayerNum;
        int secondPlayerNum;
        boolean isGameOver = false;
        Scanner scan = new Scanner(System.in);
        System.out.printf("\nКомпьютер загадал число от 1 до 100. Вам нужно угадать данное число.%n");
        do {
            do {
                System.out.print(firstPlayer.getName() + " введите число: ");
                firstPlayerNum = scan.nextInt();
            } while (!firstPlayer.setNumber(firstPlayerNum)); 
            
            if (firstPlayer.getNumber() == hiddenNum) {
                System.out.println(firstPlayer.getName() + " выиграл!");
                isGameOver = true;
                break;
            } else {
                System.out.printf("%d %s числа, которое загадал компьютер%n", firstPlayer.getNumber(),
                        firstPlayer.getNumber() > hiddenNum ? "больше" : "меньше");
            }

            do {
                System.out.print(secondPlayer.getName() + " введите число: ");
                secondPlayerNum = scan.nextInt();
            } while (!secondPlayer.setNumber(secondPlayerNum)); 
            
            if (secondPlayer.getNumber() == hiddenNum) {
                System.out.println(secondPlayer.getName() + " выиграл!");
                isGameOver = true;
                break;
            } else {
                System.out.printf("%d %s числа, которое загадал компьютер%n", secondPlayer.getNumber(),
                        secondPlayer.getNumber() > hiddenNum ? "больше" : "меньше");
            }
        } while (!isGameOver);
    }
}