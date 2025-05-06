import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String continueCalculations = "";
 
        do {
            System.out.print("Введите первое число: ");
            long operandOne = scan.nextLong();
            calc.setOperandOne(operandOne);
            scan.nextLine();

            char operator;
            do {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                operator = scan.nextLine().charAt(0);
            } while (!calc.setOperator(operator));
            
            long operandTwo;
            do {
                System.out.print("Введите второе число: ");
                operandTwo = scan.nextLong();
                scan.nextLine();
            } while (!calc.setOperandTwo(operandTwo));
            
            System.out.printf("%d %c %d = %.3f%n", 
                    calc.getOperandOne(),
                    calc.getOperator(),
                    calc.getOperandTwo(),
                    calc.calculate());

            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                continueCalculations = scan.nextLine().trim().toLowerCase();
            } while (!continueCalculations.equals("yes") &&
                        !continueCalculations.equals("no"));
        } while (!continueCalculations.equals("no"));
    }
}