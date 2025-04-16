import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        final LocalTime startLocalTime = LocalTime.now();
        
        System.out.println("\n1. РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        System.out.println("\tПервый способ решения (float)");
        float penCost = 105.5f;
        float bookCost = 235.83f;
        float discountPercentage = 0.11f;
        float basePrice = penCost + bookCost;
        float discountAmount = basePrice * discountPercentage;
        float discountPrice = basePrice - discountAmount;
        System.out.println("\tСтоимость товаров без скидки: " + basePrice);
        System.out.println("\tСумма скидки: " + discountAmount); 
        System.out.println("\tСтоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n\tВторой способ решения (BigDecimal)"); 
        var penCostBd = new BigDecimal("105.5");
        var bookCostBd = new BigDecimal("235.83");
        var discountPercentageBd = new BigDecimal("0.11");
        var basePriceBd = penCostBd.add(bookCostBd);
        var discountAmountBd = basePriceBd.multiply(discountPercentageBd)
                .setScale(2, RoundingMode.HALF_UP);
        var discountPriceBd = basePriceBd.subtract(discountAmountBd);
        System.out.println("\tСтоимость товаров без скидки: " + basePriceBd);
        System.out.println("\tСумма скидки: " + discountAmountBd);
        System.out.println("\tСтоимость товаров со скидкой: " + discountPriceBd);

        System.out.println("\n2.ВЫВОД ASCII-ГРАФИКИ");
        char slash = '/';
        char backSlash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        
        System.out.println("                               " + slash + backSlash); 
        System.out.println("\t    J    a  v     v   " + slash + "  " + backSlash);
        System.out.println("\t    J   a a  v   v   " + slash + underscore + leftParenthesis +
                " " + rightParenthesis + backSlash);
        System.out.println("\t J  J  aaaaa  V V   " + slash + "      " + backSlash);
        System.out.println("\t  JJ  a     a  V   " + slash + underscore + underscore + underscore +
                        underscore + slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n3. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        byte temperature = Byte.MAX_VALUE;
        System.out.println("\t[Температура, °C]"); 
        System.out.println("\tИсходная: " + temperature);
        System.out.println("\t+1: " + ++temperature);
        System.out.println("\t-1: " + --temperature); 
        short pressure = Short.MAX_VALUE;
        System.out.println("\t[Давление, кг/см2]"); 
        System.out.println("\tИсходное: " + pressure);
        System.out.println("\t+1: " + ++pressure);
        System.out.println("\t-1: " + --pressure);
        char systemStatusCode = Character.MAX_VALUE;
        System.out.println("\t[Код состояния системы]"); 
        System.out.println("\tИсходное: " + (int) systemStatusCode);
        System.out.println("\t+1: " + (int) ++systemStatusCode);
        System.out.println("\t-1: " + (int) --systemStatusCode);
        int traveledDistance = Integer.MAX_VALUE;
        System.out.println("\t[Пройденная дистанция, км]"); 
        System.out.println("\tИсходная: " + traveledDistance);
        System.out.println("\t+1: " + ++traveledDistance);
        System.out.println("\t-1: " + --traveledDistance);
        long sinceStartTime = Long.MAX_VALUE;
        System.out.println("\t[Время с момента старта, с]"); 
        System.out.println("\tИсходное: " + sinceStartTime);
        System.out.println("\t+1: " + ++sinceStartTime);
        System.out.println("\t-1: " + --sinceStartTime);
        
        System.out.println("\n4. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ");
        int a1Cell = 2;
        int b2Cell = 5;

        System.out.println("\tМетод: через третью переменную"); 
        System.out.println("\tДо:\t" + "A1 = " + a1Cell + ", B2 = " + b2Cell);
        int swap = a1Cell;
        a1Cell = b2Cell;
        b2Cell = swap;
        System.out.println("\tПосле:\t" + "A1 = " + a1Cell + ", B2 = " + b2Cell);
        System.out.println("\tМетод: через арифметические операции"); 
        a1Cell += b2Cell;
        b2Cell = a1Cell - b2Cell;
        a1Cell -= b2Cell;
        System.out.println("\tПосле:\t" + "A1 = " + a1Cell + ", B2 = " + b2Cell);
        System.out.println("\tМетод: через побитовые операции (^)"); 
        a1Cell ^= b2Cell;
        b2Cell ^= a1Cell;
        a1Cell ^= b2Cell;
        System.out.println("\tПосле:\t" + "A1 = " + a1Cell + ", B2 = " + b2Cell);
        
        System.out.println("\n5. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
        int firstCode = 1055;
        int secondCode = 1088;
        int firdCode = 1080;
        int fourthCode = 1074;
        int fifthCode = 1077;
        int sixthCode = 1090;
        System.out.printf("%6d%6d%6d%6d%6d%6d%n", firstCode, secondCode, firdCode,
                        fourthCode, fifthCode, sixthCode);

        String firstSymbol = String.valueOf((char) firstCode);
        String secondSymbol = String.valueOf((char) secondCode);
        String firdSymbol = String.valueOf((char) firdCode);
        String fourthSymbol = String.valueOf((char) fourthCode);
        String fifthSymbol = String.valueOf((char) fifthCode);
        String sixthSymbol = String.valueOf((char) sixthCode);
        System.out.printf("%6s%6s%6s%6s%6s%6s%n", firstSymbol, secondSymbol,
                        firdSymbol, fourthSymbol, fifthSymbol, sixthSymbol);
        
        System.out.println("\n6. МАНИПУЛЯЦИИ С СОТНЯМИ, ДЕСЯТКАМИ И ЕДИНИЦАМИ ЧИСЛА");
        int hundreds;
        int tens;
        int ones;
        int number = 123;
        ones = number % 10;
        tens = (number / 10) % 10;
        hundreds = (number / 10) / 10;
        int digitsSum;
        int digitsProduct;
        digitsSum = ones + tens + hundreds;
        digitsProduct = ones * tens * hundreds;

        System.out.println("\tЧисло " + number + " содержит:");
        System.out.println("\t\tсотен - " + hundreds);
        System.out.println("\t\tдесятков - " + tens);
        System.out.println("\t\tединиц - " + ones);
        System.out.println("\t\tСумма разрядов = " + digitsSum); 
        System.out.println("\t\tПроизведение разрядов = " + digitsProduct); 
                
        System.out.println("\n7 ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        Runtime runtime = Runtime.getRuntime();
        int availableCors = runtime.availableProcessors();
        long usedMemory = runtime.totalMemory() / (1024 * 1024);
        long freeMemory = runtime.freeMemory() / (1024 * 1024);
        final long totalMemory = runtime.maxMemory() / (1024 * 1024);
        System.out.println("\tДоступное количество ядер: " + availableCors);
        System.out.println("\tИспользуемый объем памяти (Мб): " + usedMemory);;
        System.out.println("\tСвободный объем памяти (Мб): " + freeMemory);
        System.out.println("\tМаксимально доступный объем памяти (Мб): " + totalMemory);
        System.out.println("\tСистемный диск: " + System.getProperty("user.home"));
        System.out.println("\tВерсию ОС: " + System.getProperty("os.name")); 
        System.out.println("\tВерсию Java: " + System.getProperty("java.version")); 
        System.out.println("\tсимвол разделения пути к файлу (сепаратор): " +
                System.getProperty("file.separator"));

        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА"); 
        LocalTime endLocalTime = LocalTime.now();        
        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1_000_000_000.0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
    
        System.out.printf("\t| %-18s | %-12s | %n", "Начало проверки", dtf.format(startLocalTime));
        System.out.println("\t+-----------------------------------+"); 
        System.out.printf("\t| %-18s | %-12s | %n", "Окончание проверки", dtf.format(endLocalTime));
        System.out.println("\t+-----------------------------------+"); 
        System.out.printf("\t| %-18s | %5.3f секунд | %n", "Время работы", executionTime);
    }
}