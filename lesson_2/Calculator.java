public class Calculator {
    private long operandOne;
    private long operandTwo;
    private char operator;

    public long getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(long operandOne) {
        this.operandOne = operandOne;
    }
    
    public long getOperandTwo() {
        return operandTwo;
    }

    public boolean setOperandTwo(long operandTwo) {
        if (operator == '/' &&
                operandTwo == 0) {
            System.out.println("\tОшибка: деление на ноль запрещено");
            return false;
        }

        this.operandTwo = operandTwo;
        return true;
    }

    public char getOperator() {
        return operator; 
    }

    public boolean setOperator(char operator) {
        if (operator != '+' &&
                operator != '-' &&
                operator != '/' &&
                operator != '*' &&
                operator != '^' &&
                operator != '%') {
            System.out.printf("\tОшибка: операция '%c' не поддерживается%n", operator);
            return false;
        }

        this.operator = operator;
        return true;
    }

    public float calculate() {
        switch (operator) {
            case '+':
                return operandOne + operandTwo;
            case '-':
                return operandOne - operandTwo;
            case '*': 
                return operandOne * operandTwo;
            case '/':
                return (float) operandOne / operandTwo;
            case '^':
                float result = 1f;
                for (long i = 0; i < Math.abs(operandTwo); i++) {
                    result *= operandOne;
                }
                return operandTwo < 0 ? 1 / result : result;
            case '%':
                return operandOne % operandTwo;
        }
        return 0;
    }
}