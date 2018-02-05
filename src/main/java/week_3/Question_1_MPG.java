package week_3;

import input.InputUtils;

/**
 *

 Write a program to calculate the MPG for a car journey.
 (MPG = Miles per gallon, calculate by dividing number of miles, by number of gallons of gas used).

 Write a method called mpg that has two arguments, in the following order:
 - a double to represent the number of miles driven, and
 - a double to represent the number of gallons of gas used on a car journey
 And returns a double value, representing the MPG for the journey.

 Your method should calculate and return the MPG for the car journey.  Your main method should
 -	Ask the user for the miles and gas used
 -	Call your method
 -	Use the returned value to display the MPG

 */

public class Question_1_MPG {

    public static void main(String[] args) {
        new Question_1_MPG().calculate();
    }

    public void calculate() {

        double numberOfMiles = InputUtils.doubleInput("How many miles did you travel? "); // gathers input data

        double gasUsed = InputUtils.doubleInput("How much gas did you use? ");

        double milesPerGallon = mpg(numberOfMiles,gasUsed);

        System.out.println("Your car drives "+ milesPerGallon + " MPG.");

    }


    public static double mpg(double miles,double gas) { //this method calculates MPG and returns result
        double milesPerGallon= miles/gas;

        return milesPerGallon;

    }

}
