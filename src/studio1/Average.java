package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main (String[] args){

        ArgsProcessor ap = new ArgsProcessor(args);
        double num1 = ap.nextDouble("Enter number1: ");
        double num2 = ap.nextDouble("Enter number2: ");

        System.out.println("Average of " + num1 + " and " + num2 + " is " + ((num1+num2)/2) + ".");

    }
}
