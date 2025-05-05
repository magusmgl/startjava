import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        String continueCalculations = "";
        Scanner scan = new Scanner(System.in);

        while (!continueCalculations.equalsIgnoreCase("NO")) {
            System.out.print("Введите первое число: ");
            long operandOne = scan.nextLong();
            calc.setOperandOne(operandOne);
            scan.nextLine();

            boolean isSaveOperator;
            do {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                char operator = scan.nextLine().charAt(0);
                isSaveOperator = calc.setOperator(operator);
            } while (!isSaveOperator);
            
            boolean isSaveOperandTwo;
            do {
                System.out.print("Введите второе число: ");
                long operandTwo = scan.nextLong();
                isSaveOperandTwo = calc.setOperandTwo(operandTwo);
                scan.nextLine();
            } while (!isSaveOperandTwo);
            
            System.out.printf("%d %c %d = %.3f%n", 
                    calc.getOperandOne(),
                    calc.getOperator(),
                    calc.getOperandTwo(),
                    calc.calculate());

            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                continueCalculations = scan.nextLine();
            } while (!continueCalculations.equalsIgnoreCase("YES") &&
                        !continueCalculations.equalsIgnoreCase("NO"));
        }
    }
}