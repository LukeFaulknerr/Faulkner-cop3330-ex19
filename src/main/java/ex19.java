/*
    UCF COP3330 Fall 2021 Assignment 19 Solution
    Copyright 2021 Luke Faulkner
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {

        // Variables
        double w, h, bmi;
        Scanner dataReader = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.HALF_UP);

        // Prompt
        System.out.print("What is your weight in pounds? ");
        w = dataReader.nextDouble();
        System.out.print("What is your height in inches? ");
        h = dataReader.nextDouble();

        // Calc
        bmi = (w / (h * h)) * 703;

        // Output
        System.out.println("Your BMI is " + df.format(bmi));

        if (bmi < 18.5)
            System.out.print("You are underweight. You should see your doctor.");
        else if (bmi > 18.5 && bmi < 25)
            System.out.print("You are within the ideal weight range.");
        else
            System.out.print("You are overweight. You should see your doctor.");

    }
}
