import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        float penCost = 105.5f;
        float bookCost = 235.83f;
        float discountPercentage = 0.11f;
        float totalCostWihoutDiscount = penCost + bookCost;
        float totalDiscountAmount = totalCostWihoutDiscount * discountPercentage;
        float totalCostWihDiscount = totalCostWihoutDiscount - totalDiscountAmount;
        
        System.out.println("\tПервый способ решения (float)");
        System.out.println("\tСтоимость товаров без скидки: " + totalCostWihoutDiscount);
        System.out.println("\tСумма скидки: " + totalDiscountAmount); 
        System.out.println("\tСтоимость товаров со скидкой: " + totalCostWihDiscount);

        var penCostBd = new BigDecimal("105.5");
        var bookCostBd = new BigDecimal("235.83");
        var discountPercentageBd = new BigDecimal("0.11");
        var totalCostWihoutDiscountBd = penCostBd.add(bookCostBd);
        var totalDiscountAmountBd = totalCostWihoutDiscountBd.multiply(discountPercentageBd)
                .setScale(2, RoundingMode.HALF_UP);
        var totalCostWihDiscountBd = totalCostWihoutDiscountBd.subtract(totalDiscountAmountBd);

        System.out.println("\n\tВторой способ решения (BigDecimal)"); 
        System.out.println("\tСтоимость товаров без скидки: " + totalCostWihoutDiscountBd);
        System.out.println("\tСумма скидки: " + totalDiscountAmountBd);
        System.out.println("\tСтоимость товаров со скидкой: " + totalCostWihDiscountBd);

        System.out.println("\n2.ВЫВОД СЛОВА JAVA");
        System.out.println("\t    J    a  v     v  a");
        System.out.println("\t    J   a a  v   v  a a");
        System.out.println("\t J  J  aaaaa  V V  aaaaa");
        System.out.println("\t  JJ  a     a  V  a     a");

        System.out.println("\n3. ВЫВОД MIN И MAX ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ");
        byte byteNumber = 127;
        System.out.println("\tТип byte исходное значение: " + byteNumber);
        System.out.println("\tТип byte инкремент на единицу: " + ++byteNumber);
        System.out.println("\tТип byte декремент на единицу: " + --byteNumber); 
        short shortNumber = 32_767;
        System.out.println("\tТип short исходное значение: " + shortNumber);
        System.out.println("\tТип short инкремент на единицу: " + ++shortNumber);
        System.out.println("\tТип short декремент на единицу: " + --shortNumber);
        int intNumber = 2_147_483_647;
        System.out.println("\tТип int исходное значение: " + intNumber);
        System.out.println("\tТип int инкремент на единицу: " + ++intNumber);
        System.out.println("\tТип int декремент на единицу: " + --intNumber);
        long longNumber = 9_223_372_036_854_775_807L;
        System.out.println("\tТип long исходное значение: " + longNumber);
        System.out.println("\tТип long инкремент на единицу: " + ++longNumber);
        System.out.println("\tТип long декремент на единицу: " + --longNumber);

        System.out.println("\n4. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ");
        int a1Cell = 2;
        int b2Cell = 5;
        int intermediateVariable;

        System.out.println("\tМетод: через третью переменную"); 
        System.out.println("\tДо:\t" + "A1 = " + a1Cell + ", B2 = " + b2Cell);
        intermediateVariable = a1Cell;
        a1Cell = b2Cell;
        b2Cell = intermediateVariable;
        System.out.println("\tПосле:\t" + "A1 = " + a1Cell + ", B2 = " + b2Cell);
        System.out.println("\tМетод: через арифметические операции"); 
        a1Cell = a1Cell + b2Cell;
        b2Cell = a1Cell - b2Cell;
        a1Cell = a1Cell - b2Cell;
        System.out.println("\tПосле:\t" + "A1 = " + a1Cell + ", B2 = " + b2Cell);
        System.out.println("\tМетод: через побитовые операции (^)"); 
        a1Cell = a1Cell ^ b2Cell;
        b2Cell = b2Cell ^ a1Cell;
        a1Cell = a1Cell ^ b2Cell;
        System.out.println("\tПосле:\t" + "A1 = " + a1Cell + ", B2 = " + b2Cell);
        
        System.out.println("\n5. ВЫВОД СИМВОЛОВ И ИХ КОДОВ");
        char dollarSymbol = '$';
        char asteriskSymbol = '*';
        char atSignSymbol = '@';
        char caretSymbol = '^';
        char tildeSymbol = '~';
        System.out.println("\tкод символа: " + (int) dollarSymbol +
                    ", соответствующий коду символ: " + dollarSymbol);
        System.out.println("\tкод символа: " + (int) asteriskSymbol +
                    ", соответствующий коду символ: " + asteriskSymbol);
        System.out.println("\tкод символа: " + (int) atSignSymbol +
                    ", соответствующий коду символ: " + atSignSymbol);
        System.out.println("\tкод символа: " + (int) caretSymbol +
                    ", соответствующий коду символ: " + caretSymbol);
        System.out.println("\tкод символа: " + (int) tildeSymbol +
                    ", соответствующий коду символ: " + tildeSymbol);

        System.out.println("\n6. ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА");
        char slash = '/';
        char backSlash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.println("\t    " + slash + backSlash + "    ");
        System.out.println("\t   " + slash + "  " + backSlash + "   ");
        System.out.println("\t  " + slash + underscore + leftParenthesis +
                " " + rightParenthesis + backSlash + "  ");
        System.out.println("\t " + slash + "      " + backSlash + " ");
        System.out.println("\t" + slash + underscore + underscore + underscore +
                underscore + slash + backSlash + underscore + underscore + backSlash);
        
        System.out.println("\n7. МАНИПУЛЯЦИИ С СОТНЯМИ, ДЕСЯТКАМИ И ЕДИНИЦАМИ ЧИСЛА");
        int hundreds;
        int tens;
        int units;
        int number = 543;
        units = number % 10;
        tens = (number / 10) % 10;
        hundreds = (number / 10) / 10;
        int digitsSum;
        int digitsProduct;
        digitsSum = units + tens + hundreds;
        digitsProduct = units * tens * hundreds;

        System.out.println("\tЧисло " + number + " содержит:");
        System.out.println("\t\tсотен - " + hundreds);
        System.out.println("\t\tдесятков - " + tens);
        System.out.println("\t\tединиц - " + units);
        System.out.println("\t\tСумма разрядов = " + digitsSum); 
        System.out.println("\t\tПроизведение разрядов = " + digitsProduct); 
        
        System.out.println("\n8. ПЕРЕВОД СЕКУНД В ЧАСЫ, МИНУТЫ И СЕКУНДЫ");
        int secondsNumber = 86399;
        int hh = (secondsNumber / 60) / 60;
        int mm = (secondsNumber / 60) % 60;
        int ss = secondsNumber % 60;
        System.out.println("\t" + secondsNumber + " секунд = " + hh + ":" + mm + ":" + ss); 
        
        System.out.println("\n9 ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        Runtime runtime = Runtime.getRuntime();
        int availableCors = runtime.availableProcessors();
        System.out.println("\tДоступное количество ядер: " + availableCors);
        long usedMemory = runtime.totalMemory();
        System.out.println("\tИспользуемый объем памяти (Мб): " + usedMemory);;
        long freeMemory = runtime.freeMemory();
        System.out.println("\tСвободный объем памяти (Мб): " + freeMemory);
        long totalMemory = runtime.maxMemory();
        System.out.println("\tМаксимально доступный объем памяти (Мб): " + totalMemory);
        System.out.println("\tСистемный диск: " + System.getProperty("user.home"));
        System.out.println("\tВерсию ОС: " + System.getProperty("os.name")); 
        System.out.println("\tВерсию Java: " + System.getProperty("java.version")); 
        System.out.println("\tсимвол разделения пути к файлу (сепаратор): " +
                System.getProperty("file.separator")); 
    }
}