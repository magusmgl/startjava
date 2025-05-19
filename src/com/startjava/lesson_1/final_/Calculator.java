package src.com.startjava.lesson_1.final_; 

public class Calculator {
    public static void main(String[] args) {
        int operandOne = 2;
        int operandTwo = 10;
        char operator = '/';
        float result = 0;
        
        if (operator == '+') {
            result = operandOne + operandTwo;
        } else if (operator == '-') {
            result = operandOne - operandTwo;
        } else if (operator == '*') {
            result = operandOne * operandTwo;
        } else if (operator == '/') {
            result = (float) operandOne / operandTwo;
        } else if (operator == '^') {
            result = 1;
            for (int i = 0; i < operandTwo; i++) {
                result *= operandOne;
            }
        } else if (operator == '%') {
            result = operandOne % operandTwo;
        }
        System.out.println(operandOne + " " + operator + " " + operandTwo + " = " + result);
    }
}