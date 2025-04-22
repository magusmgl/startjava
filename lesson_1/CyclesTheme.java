import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n\n1. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА");
        int number = 3242592;
        int digitsSum = 0;
        int numberTwoCounted = 0;
        System.out.print("\tВ ");
        while (number > 0) {
            int currentDigit = number % 10;
            System.out.print(currentDigit);
            digitsSum += currentDigit;
            if (currentDigit == 2) {
                numberTwoCounted += 1;
            }
            number = number / 10;
        }
        System.out.println((numberTwoCounted % 2 == 0 ? " четное (" : " не четное (") + 
                numberTwoCounted + ") количество двоек.");
        System.out.println("\tСумма чисел = " + digitsSum);

        System.out.println("\n2. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        int palindromeNumber = 1234321;
        int originalNumber = palindromeNumber;
        int reversedNumber = 0;
        
        while (originalNumber != 0) {
            reversedNumber = reversedNumber * 10 + originalNumber % 10;
            originalNumber /= 10;
        }
        System.out.printf("\tЧисло %d - %s палиндром", palindromeNumber, 
                palindromeNumber == reversedNumber ? "" : "не");

        System.out.println("\n3. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");
        int luckyNumber = 101002;
        int leftNumbers = luckyNumber / 1000;
        int rightNumbers = luckyNumber % 1000;
        int leftNumbersSum = 0;
        int rightNumbersSum = 0;
        for (int k = 1; k <= 3; k++) {
            leftNumbersSum += leftNumbers % 10;
            leftNumbers /= 10;

            rightNumbersSum += rightNumbers % 10;
            rightNumbers /= 10;
        }
        System.out.printf("\tЧисло %d - %s%n", luckyNumber,
                leftNumbersSum == rightNumbersSum ? "счастливое" : "не счастливое");
        System.out.printf("\tСумма чисел %03d = %d%n", luckyNumber / 1000, leftNumbersSum);
        System.out.printf("\tСумма чисел %03d = %d%n", luckyNumber % 1000, rightNumbersSum);

        System.out.println("\n4. ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ");
        Random ran = new Random();
        Boolean hasSmallLetter = false;
        Boolean hasBigLetter = false;
        Boolean hasNumber = false;
        Boolean hasSymbols = false;
        int passwordLength = 8;
    
        System.out.print("\tПароль: ");
        for (var i = 1; i <= passwordLength; i++) {
            char ch = (char) (ran.nextInt(126 - 33 + 1) + 33);
            System.out.print(ch);
            
            if (Character.isLowerCase(ch)) {
                hasSmallLetter = true;
            }
            if (Character.isUpperCase(ch)) {
                hasBigLetter = true;
            }
            if (Character.isDigit(ch)) {
                hasNumber = true;
            }
            if (!Character.isLetterOrDigit(ch)) {
                hasSymbols = true;
            }
        }
        System.out.print("\n\tНадежность: ");
        if (passwordLength >= 8 &&
                hasSmallLetter &&
                hasBigLetter &&
                hasSymbols) {
            System.out.println(" Надежный");
        } else if (passwordLength >= 8 &&
                (hasBigLetter ||
                hasNumber)) {
            System.out.println(" Средний");
        } else {
            System.out.println(" Слабый");
        }
  
        System.out.println("\n\n5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");
        int firstNumber = 10;
        int secondNumber = 5;
        int firdNumber = 1;
        int max;
        if (firstNumber >= secondNumber && firstNumber >= firdNumber) {
            max = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= firdNumber) {
            max = secondNumber;
        } else {
            max = firdNumber;
        }
        int min;
        if (firstNumber <= secondNumber && firstNumber <= firdNumber) {
            min = firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= firdNumber) {
            min = secondNumber;
        } else {
            min = firdNumber;
        }
        System.out.print("\t");
        for (var i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n6. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        int startIntervaL = 1;
        int endInterval = 24;
        int j = 0;
        for (int i = startIntervaL; i <= endInterval; i++) {
            if (i % 2 == 0) {
                j += 1;
                if (j % 5 == 0) {
                    System.out.printf("%5d%n", i);
                } else {
                    System.out.printf("%5d", i);
                }
            }
            if (i == endInterval && j % 5 != 0) {
                int zerosNumber = 5 - j % 5;
                for (int k = 1; k <= zerosNumber; k++) {
                    System.out.printf("%5d", 0);
                }
                System.out.println(); 
            }
        }

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ");
        String firstColName = "DECIMAL";
        String secondColName = "CHARACTER";
        String firdColName = "DESCRIPTION";
        System.out.printf("%10s%10s%13s%n", firstColName, secondColName, firdColName);
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("     %-10d%-10c%-10s%n", i, i, Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("     %-10d%-10c%-10s%n", i, i, Character.getName(i));
            }
        }

        System.out.println("\n\n8. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        char asterisk = 42;
        char underscore = 95;
        char caret = 94;

        for (int i = 1; i <= 5; i++) {
            for (int k = 0; k <= 10; k++) {
                System.out.printf("%2c", underscore);
            }
            System.out.print(" "); 
            for (int m = 1; m <= 5 - i + 1; m++) {
                System.out.printf("%2c", asterisk);
            }
            System.out.print(" ");
            for (int l = 1; l <= 1 + i - 1; l++) {
                System.out.printf("%2c", caret);
            }
            System.out.println();
        }

        System.out.println("\n9. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ");
        for (int p = 0; p <= 9; p++) {
            for (int o = 1; o <= 9; o++) {
                if (p == 0 && o == 1) {
                    System.out.printf("%3s", "|");
                } else if (p == 0 && o != 1) {
                    System.out.printf("%3d", o);
                } else if (p == 1 && o == 1) {
                    System.out.println();
                    System.out.printf("--%s", "+");
                } else if (p == 1 && o != 1) {
                    System.out.printf("%3s", "---");
                } else if ((p != 0 || p != 1) && o == 1) {
                    System.out.println();
                    System.out.printf("%-2d|", p);
                } else if ((p != 0 || p != 1) && o != 1) {
                    System.out.printf("%3d", p * o);
                }
            }    
        }
    }
}
