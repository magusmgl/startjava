import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean isContinueCalculations = true;
        while (isContinueCalculations) {
            Calculator calculatorTest = new Calculator();

            Scanner scan = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            long operandOne = scan.nextLong();
            calculatorTest.setOperandOne(operandOne);
            scan.nextLine();

            do {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                char operator = scan.nextLine().charAt(0); 
                calculatorTest.setOperator(operator);
            } while (!calculatorTest.getMathOperationCorrect());
            
            do {
                System.out.print("Введите второе число: ");
                long operandTwo = scan.nextLong();
                calculatorTest.setOperandTwo(operandTwo);
                scan.nextLine();
            } while (!calculatorTest.getMathOperationCorrect());
            
            System.out.printf("%d %c %d = %.3f%n", 
                    calculatorTest.getOperandOne(),
                    calculatorTest.getOperator(),
                    calculatorTest.getOperandTwo(),
                    calculatorTest.calulateMathOperation());

            String continueCalculations;
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                continueCalculations = scan.nextLine();
            } while (!(continueCalculations.equalsIgnoreCase("YES") ||
                        continueCalculations.equalsIgnoreCase("NO")));
            
            isContinueCalculations = continueCalculations.equalsIgnoreCase("NO") ? false : true;
        }
    }
}