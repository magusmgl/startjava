// package ru.topjava.lesson1;
import java.util.Random;

public class RpsGameFormatting {
    // Игра Камень-Ножницы-Бумага
    public static void main(String[] args) throws InterruptedException {
        String rock = "R";
        String scissors= "S";
        String paper = "P";
        Random rnd = new Random();
        
        // Ход первого игрока
        String firstPlayerName = "HEL";
        System.out.println("Ход " + firstPlayerName + ": ");

        for (int i = 0; i < 5; i++) {
            System.out.print (rock + "\r") ;
            Thread.sleep(100);
            System.out.print (scissors + "\r");
            Thread.sleep(100);
            System.out.print (paper + "\r");
            Thread.sleep(100);
        }

        int firstPlayerPositon = rnd.nextInt(1, 100);
        String firstPlayerSign = rock;
        if (firstPlayerPositon > 66) {
            firstPlayerSign = paper;
        } else if (firstPlayerPositon > 33) {
            firstPlayerSign = scissors;
        }
        System.out.println(firstPlayerSign);

         // Ход второго игрока
        String secondPlayerName = "WALLE";
        System.out.println("Ход " + secondPlayerName + ": ");

        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print (paper + "\r");
            Thread.sleep(100);
        }

        int secondPlayerPosition = rnd.nextInt (1, 100);
        String secondPlayerSign = rock;
        if (secondPlayerPosition > 66) {
            secondPlayerSign = paper;
        } else if (secondPlayerPosition > 33) {
            secondPlayerSign = scissors;
        }
        System.out.println (secondPlayerSign);

        if (firstPlayerSign.equals(secondPlayerSign)) {
            System.out.println("Победила дружба!");
            return;
        }

        boolean isFirstPlayerWin = firstPlayerSign.equals(rock) && secondPlayerSign.equals(scissors) ||
                firstPlayerSign.equals(scissors) && secondPlayerSign.equals(paper) ||
                firstPlayerSign.equals(paper) && secondPlayerSign.equals(rock);

        if (isFirstPlayerWin) {
            System.out.println("\nПобедил - " + firstPlayerName);
        } else {
            System.out.println("\nПобедил - " + secondPlayerName);
        }
    }
}