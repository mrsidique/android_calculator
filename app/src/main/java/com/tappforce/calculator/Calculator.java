package com.tappforce.calculator;

/**
 * Created by reyaadsidique on 1/13/17.
 */



public class Calculator {
    public enum Operand {
        add,
        subtract,
        multiply,
        divide,
        unselected,
    }

    double value1 = 0;
    double value2;
    Operand selectedOperand;
    Boolean value1Entered;

    public Calculator() {
        selectedOperand = Operand.unselected;
        value1Entered = false;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public Operand getSelectedOperand() {
        return selectedOperand;
    }

    public void setSelectedOperandWithOperandString(String operandString) {
        switch (operandString) {
            case "+":
                this.selectedOperand = Operand.add;
                break;
            case  "-":
                this.selectedOperand = Operand.subtract;
                break;
            case "X":
                this.selectedOperand = Operand.multiply;
                break;
            case "÷":
                this.selectedOperand = Operand.divide;
                break;
            default:
                this.selectedOperand = Operand.unselected;
                break;
        }
    }

    public Boolean getValue1Entered() {
        return value1Entered;
    }

    public void setValue1Entered(Boolean value1Entered) {
        this.value1Entered = value1Entered;
    }

    public double performOperation () {
        double result = 0;
        switch (selectedOperand) {
            case add:
                result = value1 + value2;
                break;
            case subtract:
                result = value1 - value2;
                break;
            case multiply:
                result = value1 * value2;
                break;
            case divide:
                result = value1 / value2;
                break;
            default:

                break;
        }
        value1 = result;
        return result;
    }


}
