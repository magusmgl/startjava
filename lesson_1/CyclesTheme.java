import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n\n1. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА");
        int originalNumber = 3242592;
        int digitsSum = 0;
        int twosCount = 0;
        System.out.print("\tВ ");
        while (originalNumber > 0) {
            int currentDigit = originalNumber % 10;
            System.out.print(currentDigit);
            digitsSum += currentDigit;
            if (currentDigit == 2) {
                twosCount++;
            }
            originalNumber /= 10;
        }
        System.out.println((twosCount % 2 == 0 ? " четное (" : " не четное (") + 
                twosCount + ") количество двоек.");
        System.out.println("\tСумма чисел = " + digitsSum);

        System.out.println("\n2. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        originalNumber = 1234321;
        int currentNumber = originalNumber;
        int reversedNumber = 0;
        
        while (currentNumber > 0) {
            reversedNumber = reversedNumber * 10 + currentNumber % 10;
            currentNumber /= 10;
        }
        System.out.printf("\tЧисло %d - %s палиндром%n", originalNumber,
                originalNumber == reversedNumber ? "" : "не");

        System.out.println("\n3. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");
        originalNumber = 101002;
        int leftNumbers = originalNumber / 1000;
        int rightNumbers = originalNumber % 1000;
        int leftNumbersSum = 0;
        int rightNumbersSum = 0;
        for (int i = 1; i <= 3; i++) {
            leftNumbersSum += leftNumbers % 10;
            leftNumbers /= 10;

            rightNumbersSum += rightNumbers % 10;
            rightNumbers /= 10;
        }
        System.out.printf("\tЧисло %d - %s%n", originalNumber,
                leftNumbersSum == rightNumbersSum ? "счастливое" : "не счастливое");
        System.out.printf("\tСумма чисел %03d = %d%n", originalNumber / 1000, leftNumbersSum);
        System.out.printf("\tСумма чисел %03d = %d%n", originalNumber % 1000, rightNumbersSum);

        System.out.println("\n4. ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ");
        Random rnd = new Random();
        Boolean hasSmallLetter = false;
        Boolean hasBigLetter = false;
        Boolean hasNumber = false;
        Boolean hasSymbols = false;
        int passwordLength = 8;
        StringBuilder password = new StringBuilder();
    
        for (int i = 1; i <= passwordLength; i++) {
            char ch = (char) rnd.nextInt(33, 127);
            password.append(ch);
            
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
        System.out.print("\tПароль: " + password);
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
  
        System.out.println("\n5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");
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
        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n6. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        int startInterval = 1;
        int endInterval = 24;
        int evensCount = 0;
        for (currentNumber = startInterval; currentNumber <= endInterval; currentNumber++) {
            if (currentNumber % 2 == 0) {
                evensCount++;
                if (evensCount % 5 == 0) {
                    System.out.printf("%5d%n", currentNumber);
                } else {
                    System.out.printf("%5d", currentNumber);
                }
            }
            if (currentNumber == endInterval && evensCount % 5 != 0) {
                int zerosCount = 5 - evensCount % 5;
                for (int j = 1; j <= zerosCount; j++) {
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

        System.out.println("\n8. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        char asterisk = 42;
        char underscore = 95;
        char caret = 94;

        for (int i = 1; i <= 5; i++) {
            System.out.print("\t");
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%2c", underscore);
            }
            System.out.print(" "); 
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.printf("%2c", asterisk);
            }
            System.out.print(" ");
            for (int j = 1; j <= 1 + i - 1; j++) {
                System.out.printf("%2c", caret);
            }
            System.out.println();
        }

        System.out.println("\n9. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ");
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 0 && j == 1) {
                    System.out.printf("%3s", "|");
                } else if (i == 0 && j != 1) {
                    System.out.printf("%3d", j);
                } else if (i == 1 && j == 1) {
                    System.out.println();
                    System.out.printf("--%s", "+");
                } else if (i == 1 && j != 1) {
                    System.out.printf("%3s", "---");
                } else if ((i != 0 || i != 1) && j == 1) {
                    System.out.println();
                    System.out.printf("%-2d|", i);
                } else if ((i != 0 || i != 1) && j != 1) {
                    System.out.printf("%3d", i * j);
                }
            }    
        }
    }
}
