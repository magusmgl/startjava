import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean isMaleGender = true;
        int age = 35;
        float growth = 1.7f; 
        if (!isMaleGender) {
            System.out.println("\tПол: женский"); 
        } else {
            System.out.println("\tПол: мужской"); 
        }

        if (age > 18) {
            System.out.println("\tДоступ разрешен"); 
        } else {
            System.out.println("\tДоступ запрещен"); 
        }

        if (growth < 1.8) {
            System.out.println("\tВы среднего роста"); 
        } else {
            System.out.println("\tВы высокий"); 
        }

        System.out.println("\n2. ПОИСК БО́ЛЬШЕГО ЧИСЛА ШАГОВ");
        int stepsNumberToday = 6577;
        int stepsNumberYesterday = 8943;
        if (stepsNumberToday > stepsNumberYesterday) {
            System.out.println("\tСегодня вы были более активны и прошли: " +
                    stepsNumberToday + " шагов.");
        } else {
            System.out.println("\tВчера вы были более активны и прошли: " +
                    stepsNumberYesterday + " шагов.");
        }
        int averageStepsNumber = (stepsNumberToday + stepsNumberYesterday) / 2;
        System.out.println("\tСреднее количество шагов за два дня составило: " +
                averageStepsNumber + " шагов."); 

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
        int databaseSerialNumber = 231;
        int objectSerialNumber = 234;
        if (databaseSerialNumber == objectSerialNumber) {
            System.out.println("\t[" + databaseSerialNumber + "]: компьютер на 3-м этаже в кабинете 2"); 
        } else if (databaseSerialNumber != objectSerialNumber) {
            int dbNumberOnes = databaseSerialNumber % 10;
            int objectNumberOnes = objectSerialNumber % 10;
            int dbNumberTens = (databaseSerialNumber / 10) % 10;
            int objectNumberTens = (objectSerialNumber / 10) % 10;
            int dbNumberHundreds = databaseSerialNumber / 100;
            int objectNumberHundreds = objectSerialNumber / 100;
            if (dbNumberOnes == objectNumberOnes & 
                    dbNumberTens == objectNumberTens) {
                System.out.println("\tНет полного совпадения:");
                System.out.println("\tБаза данных: [" + databaseSerialNumber + "]");
                System.out.println("\tФактический: [_" + objectNumberTens + objectNumberOnes + "]");
            } else if (dbNumberOnes == objectNumberOnes &
                    dbNumberHundreds == objectNumberHundreds) {
                System.out.println("\tНет полного совпадения:");
                System.out.println("\tБаза данных: [" + databaseSerialNumber + "]");
                System.out.println("\tФактический: [" + objectNumberHundreds + "_" + objectNumberOnes + "]");
            } else if (dbNumberTens == objectNumberTens &
                    dbNumberHundreds == objectNumberHundreds) {
                System.out.println("\tНет полного совпадения:");
                System.out.println("\tБаза данных: [" + databaseSerialNumber + "]");
                System.out.println("\tФактический: [" + objectNumberHundreds + dbNumberTens + "_]");
            } else {
                System.out.println("\t[" + databaseSerialNumber + "]: оборудование не идентифицировано"); 
            }
        }

        System.out.println("\n5. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");
        String nickname = "1Domenic";
        char firstLetter = nickname.charAt(0);
        if (Character.isLowerCase(firstLetter)) {
            System.out.println("\tИмя " + nickname + " начинается с маленькой буквы '" + firstLetter + "'");
        } else if (Character.isUpperCase(firstLetter)) {
            System.out.println("\tИмя " + nickname + " начинается с большой буквы '" + firstLetter + "'");
        } else if (Character.isDigit(firstLetter)) {
            System.out.println("\tИмя " + nickname + " начинается с цифры '" + firstLetter + "'");
        } else if (!Character.isLetterOrDigit(firstLetter)) {
            System.out.println("\tИмя " + nickname + " начинается с символа '" + firstLetter + "'");
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        float depositAmount = 321_123.79f;
        float firstRate = 0.05f;
        float secondRate = 0.07f;
        float firdRate = 0.1f;
        float currentRate = depositAmount < 100_000 ? firstRate : (100_000 >= depositAmount &
                depositAmount <= 300_000 ? secondRate : firdRate);
        
        float accruedInterest = depositAmount * currentRate;
        float totalAmount = depositAmount + accruedInterest;
        System.out.println("\n\tРешение первым способом (тип float): ");
        System.out.println("\tСумма вклада: " + depositAmount);
        System.out.println("\tСумма начисленных %: " + accruedInterest);
        System.out.println("\tИтоговая сумма с %: " + totalAmount); 

        var depositAmoundBd = new BigDecimal("321123.79");
        var accruedInterestBd = depositAmoundBd.multiply(BigDecimal.valueOf(currentRate))
                .setScale(2, RoundingMode.HALF_UP);
        var totalAmountBd = depositAmoundBd.add(accruedInterestBd)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("\n\tРешение первым способом (тип BigDecimal): ");
        System.out.println("\tСумма вклада: " + depositAmoundBd);
        System.out.println("\tСумма начисленных %: " + accruedInterestBd);
        System.out.println("\tИтоговая сумма с %: " + totalAmountBd); 

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        int historyPercent = 59;
        int historyGrade;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 & historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 & historyPercent <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        int programmingPercent = 92;
        int programmingGrade;
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 & programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 & programmingPercent <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }
        
        float averageGrade = (historyGrade + programmingGrade) / 2;
        float averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println("\tИстория: " + historyGrade);
        System.out.println("\tПрограммирование: " + programmingGrade);
        System.out.println("\tCредний балл оценок по предметам: " + averageGrade);
        System.out.println("\tCредний % по предметам: " + averagePercent); 

        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        var monthlySales = new BigDecimal("13025.233");
        var monthlyRent = new BigDecimal("5123.018");
        var monthlyProductionCost = new BigDecimal("9001.729");
        var annualSales = monthlySales.multiply(new BigDecimal("12"));
        var annualRent = monthlyRent.multiply(new BigDecimal("12"));
        var annualProductionCost = monthlyProductionCost.multiply(new BigDecimal("12"));
        var total = annualSales.subtract(annualRent)
                .subtract(annualProductionCost)
                .setScale(2, RoundingMode.HALF_UP);
        
        if (total.compareTo(BigDecimal.ZERO) < 0) {
            System.out.printf("\tПрибыль за год: %.2f%n", total); 
        } else if (total.compareTo(BigDecimal.ZERO) == 0) {
            System.out.printf("\tПрибыль за год: %.2f%n", total); 
        } else {
            System.out.printf("\tПрибыль за год: %+.2f%n", total);
        }
    }
}