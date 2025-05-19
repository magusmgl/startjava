package src.com.startjava.lesson_1.final_; 

import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        int startInterval = 1;
        int endInterval = 101;
        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(startInterval, endInterval);
        int playerNumber = rnd.nextInt(startInterval, endInterval); 
        while (hiddenNumber != playerNumber) {
            if (hiddenNumber < playerNumber) {
                endInterval = playerNumber;
                System.out.printf("%d больше того, что загадал компьютер", playerNumber);
            } else if (hiddenNumber > playerNumber) {
                startInterval = playerNumber + 1;
                System.out.printf("%d меньше того, что загадал компьютер", playerNumber);
            }
            playerNumber = rnd.nextInt(startInterval, endInterval);
            System.out.println();
        }
        System.out.println("Вы победили!");
    }
}