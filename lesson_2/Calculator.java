public class Calculator {
    private long operandOne;
    private long operandTwo;
    private char operator;
    private boolean isMathOperationCorrect = false;

    public long getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(long operandOne) {
        this.operandOne = operandOne;
    }
    
    public long getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(long operandTwo) {
        if (operator == '/' &&
                operandTwo == 0) {
            System.out.println("\tОшибка: деление на ноль запрещено");
            isMathOperationCorrect = false;
        } else {
            this.operandTwo = operandTwo;
            isMathOperationCorrect = true;
        }
    }

    public char getOperator() {
        return operator; 
    }

    public void setOperator(char operator) {
        if (operator == '+' ||
                operator == '-' ||
                operator == '/' ||
                operator == '*' ||
                operator == '^' ||
                operator == '%') {
            this.operator = operator;
            isMathOperationCorrect = true;
        } else {
            System.out.printf("\tОшибка: операция '%c' не поддерживается%n", operator);
            isMathOperationCorrect = false;
        }
    }

    public boolean getMathOperationCorrect() {
        return isMathOperationCorrect;
    }

    public float calulateMathOperation() {
        float result = 0;
        switch (operator) {
            case '+':
                result = operandOne + operandTwo;
                break;
            case '-':
                result = operandOne - operandTwo;
                break;
            case '*': 
                result = operandOne * operandTwo;
                break;
            case '/':
                result = (float) operandOne / operandTwo;
                break;
            case '^':
                result = 1f;
                for (long i = 0; i < Math.abs(operandTwo); i++) {
                    result *= operandOne;
                }
                if (operandTwo < 0) {
                    result = 1 / result;
                }
                break;
            case '%':
                result = operandOne % operandTwo;
                break;
            default: 
                break;
        }
        return result;
    }
}