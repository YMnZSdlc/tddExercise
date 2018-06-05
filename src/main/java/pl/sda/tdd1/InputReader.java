package pl.sda.tdd1;

import java.util.Scanner;

public class InputReader {

    public static EqutionModel exctracEquation(String readedInput) {
        String reg = "(?<=[-+*/])|(?=[-+*/])";
        String [] split = readedInput.split(reg);
        if (split.length<2){

        }
        return new EqutionModel(Double.parseDouble(split[0]),Double.parseDouble(split[2]),split[1]);

    }

    public static String readInput (){
        Scanner readInput = new Scanner(System.in);
        return readInput.nextLine();
    }




}
