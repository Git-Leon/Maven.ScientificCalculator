package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class InverseCosine {
    public Double inverseCosine(double value){
        if(value <= 1 && value >= -1){
            return Math.acos(value);
        } else {
            Console.println("ERROR: Please enter a number between -1 and 1.");
            return null;
        }
    }

    public void display(Double value) {
        Console.println("cos(" + value + ")^-1 = " + inverseCosine(value));
    }
}
