package pl.sda.tdd1;

public class Main {

    public static void main(String[] args) throws InvalidNumberExeption {

//        Calculator calculator = new Calculator();
        System.out.println("Podaj działanie: ");
        String input = InputReader.readInput();
        System.out.println(input);

        EqutionModel equasion = InputReader.exctracEquation(input);

        double resultOfCalc =0;


        if (equasion.getFunctionSign().equals("+")){
            resultOfCalc = Calculator.addTwoN(equasion.getFirstNumber(),equasion.getSecondNumber());
        }else if (equasion.getFunctionSign().equals("-")){
            resultOfCalc = Calculator.subTwoN(equasion.getFirstNumber(),equasion.getSecondNumber());
        }else if (equasion.getFunctionSign().equals("*")){
            resultOfCalc = Calculator.multiplyTwoN(equasion.getFirstNumber(),equasion.getSecondNumber());
        }else if (equasion.getFunctionSign().equals("/")){
            resultOfCalc = Calculator.divideTwoN(equasion.getFirstNumber(),equasion.getSecondNumber());
        }

        System.out.println("Wynik działania to: "+ resultOfCalc);
    }
}
