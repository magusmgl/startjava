import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean isMaleGender = true;
        if (!isMaleGender) {
            System.out.println("\tПол: женский"); 
        } else {
            System.out.println("\tПол: мужской"); 
        }

        int age = 35;
        if (age > 18) {
            System.out.println("\tДоступ разрешен"); 
        } else {
            System.out.println("\tДоступ запрещен"); 
        }

        float height = 1.7f; 
        if (height < 1.8) {
            System.out.println("\tВы среднего роста"); 
        } else {
            System.out.println("\tВы высокий"); 
        }

        System.out.println("\n2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ");
        int stepsNumberToday = 6577;
        int stepsNumberYesterday = 8943;
        System.out.println("\tВчера вы прошли " + stepsNumberYesterday +
                " шагов а, сегодня " + stepsNumberToday + " шагов");
        if (stepsNumberToday > stepsNumberYesterday) {
            System.out.println("\tСегодня вы были более активны.");
        } else if (stepsNumberToday < stepsNumberYesterday) {
            System.out.println("\tСегодня вы были менее активны.");
        } else {
            System.out.println("\tСегодня вы прошли столько же шагов, что и вчера.");
        }
        int averageStepsNumber = (stepsNumberToday + stepsNumberYesterday) / 2;
        System.out.println("\tСреднее количество шагов: " +
                averageStepsNumber); 

        System.out.println("\n3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ");
        int guestsNumber = 23;

        if (guestsNumber == 0) {
            System.out.println("\tПока никто не записался на мероприятие!"); 
        } else if (guestsNumber < 0) {
            System.out.println("\tКоличество гостей не может быть отрицательным: " + guestsNumber); 
        } else {
            if (guestsNumber % 2 == 0) {
                System.out.println("\tЗаписалось " + guestsNumber +
                        " гостей. Можно формировать пары для конкурсов."); 
            } else {
                System.out.println("\tЗаписалось " + guestsNumber +
                        " гостей. Нужны индивидуальные задания."); 
            }
        }
            
        System.out.println("\n4. ИНВЕНТАРИЗАЦИЯ");
        int dbSerialNumber = 231;
        int objectSerialNumber = 234;
        if (dbSerialNumber == objectSerialNumber) {
            System.out.println("\t[№" + dbSerialNumber + "]: компьютер на 3-м этаже в кабинете 2"); 
        } else {
            System.out.println("\tНет полного совпадения:");
            System.out.println("\tБаза данных: [№" + dbSerialNumber + "]");
            
            int dbNumberOnes = dbSerialNumber % 10;
            int objectNumberOnes = objectSerialNumber % 10;
            int dbNumberTens = dbSerialNumber / 10 % 10;
            int objectNumberTens = objectSerialNumber / 10 % 10;
            int dbNumberHundreds = dbSerialNumber / 100;
            int objectNumberHundreds = objectSerialNumber / 100;

            System.out.printf("\tФактический: [№%s%s%s]%n", 
                    dbNumberHundreds == objectNumberHundreds ? objectNumberHundreds : "_",
                    dbNumberTens == objectNumberTens ? objectNumberTens : "_",
                    dbNumberOnes == objectNumberOnes ? objectNumberOnes : "_");
        }

        System.out.println("\n5. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");
        String nickname = "&Domenic";
        char firstLetter = nickname.charAt(0);
        System.out.println("\tПервый способ");
        System.out.print("\t\tИмя " + nickname + " начинается с ");
        if (firstLetter >= 97 && firstLetter <= 122) {
            System.out.println("маленькой буквы '" + firstLetter + "'");
        } else if (firstLetter >= 65 && firstLetter <= 90) {
            System.out.println("большой буквы '" + firstLetter + "'");
        } else if (firstLetter >= 48 && firstLetter <= 57) {
            System.out.println("цифры '" + firstLetter + "'");
        } else {
            System.out.println("символа '" + firstLetter + "'");
        }

        System.out.println("\n\tВторой способ");
        System.out.print("\t\tИмя " + nickname + " начинается с ");
        if (Character.isLowerCase(firstLetter)) {
            System.out.println("маленькой буквы '" + firstLetter + "'");
        } else if (Character.isUpperCase(firstLetter)) {
            System.out.println("большой буквы '" + firstLetter + "'");
        } else if (Character.isDigit(firstLetter)) {
            System.out.println("цифры '" + firstLetter + "'");
        } else if (!Character.isLetterOrDigit(firstLetter)) {
            System.out.println("символа '" + firstLetter + "'");
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        System.out.println("\n\tРешение первым способом (тип float): ");
        float depositAmount = 321_123.79f;
        float firstRate = 0.05f;
        float secondRate = 0.07f;
        float firdRate = 0.1f;
        float currentRate = firstRate;
        
        if (100_000 >= depositAmount &&
                depositAmount <= 300_000) {
            currentRate = secondRate;
        } else if (depositAmount > 300_000) {
            currentRate = firdRate;
        }

        float accruedInterest = depositAmount * currentRate;
        float totalAmount = depositAmount + accruedInterest;
        System.out.println("\tСумма вклада: " + depositAmount);
        System.out.println("\tСумма начисленных %: " + accruedInterest);
        System.out.println("\tИтоговая сумма с %: " + totalAmount); 

        System.out.println("\n\tРешение вторым способом (тип BigDecimal): ");
        var depositAmoundBd = new BigDecimal("321123.79");
        var firstRateBd = new BigDecimal("0.05");
        var secondRateBd = new BigDecimal("0.07");
        var firdRateBd = new BigDecimal("0.1");
        var currentRateBd = firstRateBd;
        
        if (depositAmoundBd.compareTo(BigDecimal.valueOf(10000)) >= 0 &&
                depositAmoundBd.compareTo(BigDecimal.valueOf(300_000)) <= 0) {
            currentRateBd = secondRateBd;
        } else if (depositAmoundBd.compareTo(BigDecimal.valueOf(300_000)) > 0) {
            currentRateBd = firdRateBd; 
        }

        var accruedInterestBd = depositAmoundBd.multiply(currentRateBd)
                .setScale(2, RoundingMode.HALF_UP); 
        var totalAmountBd = depositAmoundBd.add(accruedInterestBd)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("\tСумма вклада: " + depositAmoundBd);
        System.out.println("\tСумма начисленных %: " + accruedInterestBd);
        System.out.println("\tИтоговая сумма с %: " + totalAmountBd); 

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        int historyPercent = 59;
        int historyGrade = 2;
        
        if (historyPercent > 60 &&
                historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 &&
                historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyGrade > 91) {
            historyGrade = 5;
        }

        int programmingPercent = 92;
        int programmingGrade = 2;
        if (programmingPercent > 60 &&
                programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 &&
                programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        
        float averageGrade = (historyGrade + programmingGrade) / 2.0f;
        float averagePercent = (historyPercent + programmingPercent) / 2.0f;
        System.out.println("\tИстория: " + historyGrade);
        System.out.println("\tПрограммирование: " + programmingGrade);
        System.out.println("\tCредний балл оценок по предметам: " + averageGrade);
        System.out.println("\tCредний % по предметам: " + averagePercent); 

        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        var monthlySales = new BigDecimal("13027.233");
        var monthlyRent = new BigDecimal("5123.018");
        var monthlyProductionCost = new BigDecimal("9001.729");
        int monthsNumber = 12;
        var annualSales = monthlySales.multiply(BigDecimal.valueOf(monthsNumber));
        var annualRent = monthlyRent.multiply(BigDecimal.valueOf(monthsNumber));
        var annualProductionCost = monthlyProductionCost.multiply(BigDecimal.valueOf(monthsNumber));
        var total = annualSales.subtract(annualRent)
                .subtract(annualProductionCost)
                .setScale(2, RoundingMode.HALF_UP);
        
        if (total.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.printf("\tПрибыль за год: %.2f%n", total); 
        } else {
            System.out.printf("\tПрибыль за год: %+.2f%n", total);
        }
    }
}