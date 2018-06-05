package pl.sda.tdd1;


public class Calculator {

    public static double addTwoN(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subTwoN(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiplyTwoN(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divideTwoN(double firstNumber, double secondNumber) throws InvalidNumberExeption{
        if (secondNumber==0) throw new InvalidNumberExeption("Nie dziel przez zero");
        return firstNumber/secondNumber;
    }

    public static boolean isEvenN(double firstNumber) {
        if (firstNumber%2==0)return true;
        else return false;
    }

    public double factorialN(double number) {
//        if (number==1)return 1;
//        return number * factorialN(number-1);
        return number == 1 ? 1 : number * factorialN(number-1);
    }
}
