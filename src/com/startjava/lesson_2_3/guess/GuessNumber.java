package com.startjava.lesson_2_3.guess;

import java.util.Random;
import java.util.Scanner;
        
public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int hiddenNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        Random rnd = new Random();
        hiddenNumber = rnd.nextInt(1, 101);
        
        int firstPlayerNumber;
        int secondPlayerNumber;
        Scanner scan = new Scanner(System.in);
        System.out.printf("\nКомпьютер загадал число от 1 до 100. Вам нужно угадать данное число.%n");
        do {
            do {
                System.out.print(firstPlayer.getName() + " введите число: ");
                firstPlayerNumber = scan.nextInt();
            } while (!firstPlayer.setNumber(firstPlayerNumber)); 
            
            if (firstPlayer.getNumber() == hiddenNumber) {
                System.out.println(firstPlayer.getName() + " выиграл!");
                break;
            }

            System.out.printf("%d %s числа, которое загадал компьютер%n", firstPlayer.getNumber(),
                    firstPlayer.getNumber() > hiddenNumber ? "больше" : "меньше");
            
            do {
                System.out.print(secondPlayer.getName() + " введите число: ");
                secondPlayerNumber = scan.nextInt();
            } while (!secondPlayer.setNumber(secondPlayerNumber)); 
            
            if (secondPlayer.getNumber() == hiddenNumber) {
                System.out.println(secondPlayer.getName() + " выиграл!");
                break;
            }

            System.out.printf("%d %s числа, которое загадал компьютер%n", secondPlayer.getNumber(),
                    secondPlayer.getNumber() > hiddenNumber ? "больше" : "меньше");
        } while (true);
    }
}