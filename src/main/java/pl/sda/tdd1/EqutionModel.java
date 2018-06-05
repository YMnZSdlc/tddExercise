package pl.sda.tdd1;

import com.google.common.base.Objects;

public class EqutionModel {

    private double firstNumber;
    private double secondNumber;
    private String functionSign;


    public EqutionModel(double firstNumber, double secondNumber, String functionSign) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.functionSign = functionSign;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public String getFunctionSign() {
        return functionSign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqutionModel that = (EqutionModel) o;
        return Double.compare(that.firstNumber, firstNumber) == 0 &&
                Double.compare(that.secondNumber, secondNumber) == 0 &&
                Objects.equal(functionSign, that.functionSign);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firstNumber, secondNumber, functionSign);
    }
}
