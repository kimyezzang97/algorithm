package hhplus.ThirdWeek;

public class Calculator {

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber) {
        double answer = 0;
        answer = operation.operate(firstNumber, secondNumber);
        return answer;
    }
}
